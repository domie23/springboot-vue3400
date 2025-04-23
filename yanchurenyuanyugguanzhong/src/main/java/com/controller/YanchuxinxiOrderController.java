
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 购票订单
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/yanchuxinxiOrder")
public class YanchuxinxiOrderController {
    private static final Logger logger = LoggerFactory.getLogger(YanchuxinxiOrderController.class);

    @Autowired
    private YanchuxinxiOrderService yanchuxinxiOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YanchuxinxiService yanchuxinxiService;
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("员工".equals(role))
            params.put("yuangongId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = yanchuxinxiOrderService.queryPage(params);

        //字典表数据转换
        List<YanchuxinxiOrderView> list =(List<YanchuxinxiOrderView>)page.getList();
        for(YanchuxinxiOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YanchuxinxiOrderEntity yanchuxinxiOrder = yanchuxinxiOrderService.selectById(id);
        if(yanchuxinxiOrder !=null){
            //entity转view
            YanchuxinxiOrderView view = new YanchuxinxiOrderView();
            BeanUtils.copyProperties( yanchuxinxiOrder , view );//把实体数据重构到view中

                //级联表
                YanchuxinxiEntity yanchuxinxi = yanchuxinxiService.selectById(yanchuxinxiOrder.getYanchuxinxiId());
                if(yanchuxinxi != null){
                    BeanUtils.copyProperties( yanchuxinxi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYanchuxinxiId(yanchuxinxi.getId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(yanchuxinxiOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YanchuxinxiOrderEntity yanchuxinxiOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yanchuxinxiOrder:{}",this.getClass().getName(),yanchuxinxiOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            yanchuxinxiOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        yanchuxinxiOrder.setInsertTime(new Date());
        yanchuxinxiOrder.setCreateTime(new Date());
        yanchuxinxiOrderService.insert(yanchuxinxiOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YanchuxinxiOrderEntity yanchuxinxiOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,yanchuxinxiOrder:{}",this.getClass().getName(),yanchuxinxiOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            yanchuxinxiOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<YanchuxinxiOrderEntity> queryWrapper = new EntityWrapper<YanchuxinxiOrderEntity>()
            .eq("id",0)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YanchuxinxiOrderEntity yanchuxinxiOrderEntity = yanchuxinxiOrderService.selectOne(queryWrapper);
        if(yanchuxinxiOrderEntity==null){
            yanchuxinxiOrderService.updateById(yanchuxinxiOrder);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        yanchuxinxiOrderService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<YanchuxinxiOrderEntity> yanchuxinxiOrderList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            YanchuxinxiOrderEntity yanchuxinxiOrderEntity = new YanchuxinxiOrderEntity();
//                            yanchuxinxiOrderEntity.setYanchuxinxiOrderUuidNumber(data.get(0));                    //订单号 要改的
//                            yanchuxinxiOrderEntity.setYanchuxinxiId(Integer.valueOf(data.get(0)));   //演出信息 要改的
//                            yanchuxinxiOrderEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            yanchuxinxiOrderEntity.setBuyNumber(Integer.valueOf(data.get(0)));   //购买数量 要改的
//                            yanchuxinxiOrderEntity.setYanchuxinxiOrderTruePrice(data.get(0));                    //实付价格 要改的
//                            yanchuxinxiOrderEntity.setYanchuxinxiOrderTypes(Integer.valueOf(data.get(0)));   //订单状态 要改的
//                            yanchuxinxiOrderEntity.setInsertTime(date);//时间
//                            yanchuxinxiOrderEntity.setCreateTime(date);//时间
                            yanchuxinxiOrderList.add(yanchuxinxiOrderEntity);


                            //把要查询是否重复的字段放入map中
                                //订单号
                                if(seachFields.containsKey("yanchuxinxiOrderUuidNumber")){
                                    List<String> yanchuxinxiOrderUuidNumber = seachFields.get("yanchuxinxiOrderUuidNumber");
                                    yanchuxinxiOrderUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> yanchuxinxiOrderUuidNumber = new ArrayList<>();
                                    yanchuxinxiOrderUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("yanchuxinxiOrderUuidNumber",yanchuxinxiOrderUuidNumber);
                                }
                        }

                        //查询是否重复
                         //订单号
                        List<YanchuxinxiOrderEntity> yanchuxinxiOrderEntities_yanchuxinxiOrderUuidNumber = yanchuxinxiOrderService.selectList(new EntityWrapper<YanchuxinxiOrderEntity>().in("yanchuxinxi_order_uuid_number", seachFields.get("yanchuxinxiOrderUuidNumber")));
                        if(yanchuxinxiOrderEntities_yanchuxinxiOrderUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(YanchuxinxiOrderEntity s:yanchuxinxiOrderEntities_yanchuxinxiOrderUuidNumber){
                                repeatFields.add(s.getYanchuxinxiOrderUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [订单号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        yanchuxinxiOrderService.insertBatch(yanchuxinxiOrderList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = yanchuxinxiOrderService.queryPage(params);

        //字典表数据转换
        List<YanchuxinxiOrderView> list =(List<YanchuxinxiOrderView>)page.getList();
        for(YanchuxinxiOrderView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YanchuxinxiOrderEntity yanchuxinxiOrder = yanchuxinxiOrderService.selectById(id);
            if(yanchuxinxiOrder !=null){


                //entity转view
                YanchuxinxiOrderView view = new YanchuxinxiOrderView();
                BeanUtils.copyProperties( yanchuxinxiOrder , view );//把实体数据重构到view中

                //级联表
                    YanchuxinxiEntity yanchuxinxi = yanchuxinxiService.selectById(yanchuxinxiOrder.getYanchuxinxiId());
                if(yanchuxinxi != null){
                    BeanUtils.copyProperties( yanchuxinxi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYanchuxinxiId(yanchuxinxi.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(yanchuxinxiOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody YanchuxinxiOrderEntity yanchuxinxiOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,yanchuxinxiOrder:{}",this.getClass().getName(),yanchuxinxiOrder.toString());
            YanchuxinxiEntity yanchuxinxiEntity = yanchuxinxiService.selectById(yanchuxinxiOrder.getYanchuxinxiId());
            if(yanchuxinxiEntity == null){
                return R.error(511,"查不到该演出信息");
            }
            // Double yanchuxinxiNewMoney = yanchuxinxiEntity.getYanchuxinxiNewMoney();

            if(false){
            }
            else if((yanchuxinxiEntity.getYanchuxinxiKucunNumber() -yanchuxinxiOrder.getBuyNumber())<0){
                return R.error(511,"购买数量不能大于库存数量");
            }
            else if(yanchuxinxiEntity.getYanchuxinxiNewMoney() == null){
                return R.error(511,"演出信息价格不能为空");
            }

            //计算所获得积分
            Double buyJifen =0.0;
            Integer userId = (Integer) request.getSession().getAttribute("userId");
            YonghuEntity yonghuEntity = yonghuService.selectById(userId);
            if(yonghuEntity == null)
                return R.error(511,"用户不能为空");
            if(yonghuEntity.getNewMoney() == null)
                return R.error(511,"用户金额不能为空");
            double balance = yonghuEntity.getNewMoney() - yanchuxinxiEntity.getYanchuxinxiNewMoney()*yanchuxinxiOrder.getBuyNumber();//余额
            if(balance<0)
                return R.error(511,"余额不够支付");
            yanchuxinxiOrder.setYanchuxinxiOrderTypes(1); //设置订单状态为已支付
            yanchuxinxiOrder.setYanchuxinxiOrderTruePrice(yanchuxinxiEntity.getYanchuxinxiNewMoney()*yanchuxinxiOrder.getBuyNumber()); //设置实付价格
            yanchuxinxiOrder.setYonghuId(userId); //设置订单支付人id
            yanchuxinxiOrder.setYanchuxinxiOrderUuidNumber(String.valueOf(new Date().getTime()));
            yanchuxinxiOrder.setInsertTime(new Date());
            yanchuxinxiOrder.setCreateTime(new Date());
                yanchuxinxiEntity.setYanchuxinxiKucunNumber( yanchuxinxiEntity.getYanchuxinxiKucunNumber() -yanchuxinxiOrder.getBuyNumber());
                yanchuxinxiService.updateById(yanchuxinxiEntity);
                yanchuxinxiOrderService.insert(yanchuxinxiOrder);//新增订单
            yonghuEntity.setNewMoney(balance);//设置金额
            yonghuService.updateById(yonghuEntity);
            return R.ok();
    }

    /**
    * 退款
    */
    @RequestMapping("/refund")
    public R refund(Integer id, HttpServletRequest request){
        logger.debug("refund方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        String role = String.valueOf(request.getSession().getAttribute("role"));

            YanchuxinxiOrderEntity yanchuxinxiOrder = yanchuxinxiOrderService.selectById(id);
            Integer buyNumber = yanchuxinxiOrder.getBuyNumber();
            Integer yanchuxinxiOrderPaymentTypes =1;
            Integer yanchuxinxiId = yanchuxinxiOrder.getYanchuxinxiId();
            if(yanchuxinxiId == null)
                return R.error(511,"查不到该演出信息");
            YanchuxinxiEntity yanchuxinxiEntity = yanchuxinxiService.selectById(yanchuxinxiId);
            if(yanchuxinxiEntity == null)
                return R.error(511,"查不到该演出信息");
            Double yanchuxinxiNewMoney = yanchuxinxiEntity.getYanchuxinxiNewMoney();
            if(yanchuxinxiNewMoney == null)
                return R.error(511,"演出信息价格不能为空");

            Integer userId = (Integer) request.getSession().getAttribute("userId");
            YonghuEntity yonghuEntity = yonghuService.selectById(userId);
            if(yonghuEntity == null)
                return R.error(511,"用户不能为空");
            if(yonghuEntity.getNewMoney() == null)
                return R.error(511,"用户金额不能为空");

            Double zhekou = 1.0;


            //判断是什么支付方式 1代表余额 2代表积分
            if(yanchuxinxiOrderPaymentTypes == 1){//余额支付
                //计算金额
                Double money = yanchuxinxiEntity.getYanchuxinxiNewMoney() * buyNumber  * zhekou;
                //计算所获得积分
                Double buyJifen = 0.0;
                yonghuEntity.setNewMoney(yonghuEntity.getNewMoney() + money); //设置金额


            }

            yanchuxinxiEntity.setYanchuxinxiKucunNumber(yanchuxinxiEntity.getYanchuxinxiKucunNumber() + buyNumber);



            yanchuxinxiOrder.setYanchuxinxiOrderTypes(2);//设置订单状态为退款
            yanchuxinxiOrderService.updateById(yanchuxinxiOrder);//根据id更新
            yonghuService.updateById(yonghuEntity);//更新用户信息
            yanchuxinxiService.updateById(yanchuxinxiEntity);//更新订单中演出信息的信息
            return R.ok();
    }


    /**
     * 发货
     */
    @RequestMapping("/deliver")
    public R deliver(Integer id ){
        logger.debug("refund:,,Controller:{},,ids:{}",this.getClass().getName(),id.toString());
        YanchuxinxiOrderEntity  yanchuxinxiOrderEntity = new  YanchuxinxiOrderEntity();;
        yanchuxinxiOrderEntity.setId(id);
        yanchuxinxiOrderEntity.setYanchuxinxiOrderTypes(3);
        boolean b =  yanchuxinxiOrderService.updateById( yanchuxinxiOrderEntity);
        if(!b){
            return R.error("发货出错");
        }
        return R.ok();
    }

















}

package com.dao;

import com.entity.YanchuxinxiOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YanchuxinxiOrderView;

/**
 * 购票订单 Dao 接口
 *
 * @author 
 */
public interface YanchuxinxiOrderDao extends BaseMapper<YanchuxinxiOrderEntity> {

   List<YanchuxinxiOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

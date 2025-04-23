package com.dao;

import com.entity.YuangongyimiaojiezhongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongyimiaojiezhongView;

/**
 * 员工疫苗接种情况 Dao 接口
 *
 * @author 
 */
public interface YuangongyimiaojiezhongDao extends BaseMapper<YuangongyimiaojiezhongEntity> {

   List<YuangongyimiaojiezhongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

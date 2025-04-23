package com.dao;

import com.entity.YanchuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YanchuxinxiView;

/**
 * 演出信息 Dao 接口
 *
 * @author 
 */
public interface YanchuxinxiDao extends BaseMapper<YanchuxinxiEntity> {

   List<YanchuxinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

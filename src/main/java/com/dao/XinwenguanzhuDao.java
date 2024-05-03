package com.dao;

import com.entity.XinwenguanzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwenguanzhuView;

/**
 * 防治知识 Dao 接口
 *
 * @author 
 */
public interface XinwenguanzhuDao extends BaseMapper<XinwenguanzhuEntity> {

   List<XinwenguanzhuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

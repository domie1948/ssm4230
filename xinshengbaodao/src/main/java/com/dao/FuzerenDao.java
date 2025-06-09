package com.dao;

import com.entity.FuzerenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FuzerenView;

/**
 * 负责人 Dao 接口
 *
 * @author 
 */
public interface FuzerenDao extends BaseMapper<FuzerenEntity> {

   List<FuzerenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

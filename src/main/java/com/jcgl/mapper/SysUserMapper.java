package com.jcgl.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jcgl.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 通过id查询用户、学校、角色信息
     * @param id
     * @return
     */
    SysUser selectLinkById(Integer id);

    /**
     * 查询所有用户信息及学校、角色
     * @param queryWrapper  查询添加 可为null
     * @return SysUser 列表
     */
    List<SysUser> getUserSchool(@Param(Constants.WRAPPER) Wrapper<SysUser> queryWrapper);


}

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
     * <p>
     * 查询 : 根据state状态查询用户列表，分页显示
     * </p>
     *
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param state 状态
     * @return 分页对象
     */
    IPage<SysUser> selectPageVo(Page<?> page, Integer state);

    /**
     *
     * @param example
     * @return
     */
    //List<Employee> selectByExampleWithDept(EmployeeExample example);

    SysUser selectByPrimaryKeyWithDept(Integer userId);

    @Select("SELECT sys_user.*,sys_school.school_name FROM sys_user LEFT JOIN sys_school on sys_user.school_id=sys_school.school_id ${ew.customSqlSegment}")
    List<SysUser> getUserSchool(@Param(Constants.WRAPPER) Wrapper<SysUser> queryWrapper);
    @Select("SELECT sys_user.*,sys_school.school_name FROM sys_user LEFT JOIN sys_school on sys_user.school_id=sys_school.school_id ${ew.customSqlSegment}")
    SysUser getUserBYIdWithSchool(@Param(Constants.WRAPPER) Wrapper<SysUser> queryWrapper);

    List<SysUser> selectByExampleWithSchool(QueryWrapper queryWrapper);

    SysUser selectByPrimaryKeyWithSchool(Integer empId);

}

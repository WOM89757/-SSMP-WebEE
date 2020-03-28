package com.jcgl.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.github.pagehelper.PageInfo;
import com.jcgl.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 通过Id查询用户及学校角色信息
     * @param id
     * @return
     */
    SysUser selectLinkById(Integer id);

    /**
     * 获取用户信息及其学校和角色信息
     * @param pageNum 查询页码数
     * @param wrapper 查询条件
     * @return    页面信息
     */
    PageInfo<SysUser> getUserSchool(Integer pageNum,Wrapper<SysUser> wrapper);


    /**
     * 检查用户名是否存在
     * @param userName
     * @return
     */
    boolean checkUser(String userName);



}

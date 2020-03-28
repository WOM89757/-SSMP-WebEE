package com.jcgl.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jcgl.entity.SysUser;
import com.jcgl.mapper.SysUserMapper;
import com.jcgl.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Resource
    SysUserMapper userMapper;


    /**
     * 通过Id查询用户及学校角色信息
     * @param id
     * @return
     */
    @Override
    public SysUser selectLinkById(Integer id) {
        return  userMapper.selectLinkById(id);
    }

    /**
     * 获取用户信息及其学校和角色信息
     * @param pageNum 查询页码数
     * @param wrapper 查询条件
     * @return    页面信息
     */
    public PageInfo<SysUser> getUserSchool(Integer pageNum,Wrapper<SysUser> wrapper) {
        //设置分页
        PageHelper.startPage(pageNum, 10);
        return new PageInfo<SysUser>(this.userMapper.getUserSchool(wrapper));
    }

    /**
     * 检查用户名是否存在
     * @param userName
     * @return
     */
    @Override
    public boolean checkUser(String userName) {
        //查询符合条件的记录数，如果没有 返回 0；如果有 返回对应的数量
        long count = userMapper.selectCount((Wrapper<SysUser>) new  QueryWrapper().eq("user_name",userName));
        return count == 0;
    }



}

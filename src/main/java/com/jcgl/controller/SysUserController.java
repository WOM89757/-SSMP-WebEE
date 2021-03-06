package com.jcgl.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import com.jcgl.entity.SysUser;
import com.jcgl.service.ISysUserService;
import com.jcgl.utils.DataGridView;
import com.jcgl.utils.Message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Slf4j
@RestController
public class SysUserController {
    @Resource
    ISysUserService iSysUserService;

    /**
     * 更新员工信息
     *
     * @param sysUser 传入的员工对象
     * @return 成功信息
     */
    //占位符{userId}和 传入的对象中的 变量名相同时，才会作为对象的属性传入
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.PUT)
    @ResponseBody
    public Message updateEmp(SysUser sysUser) {
        iSysUserService.updateById(sysUser);
        System.err.println("success");
        return Message.success();
    }


    /**
     * 查询用户信息(分页查询）
     * @return
     */
    @RequestMapping("/users")
    public DataGridView getUsers(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value = "limit",defaultValue = "10")Integer limit){

       // PageInfo<SysUser> pageInfo = iSysUserService.getAll(pageNum);
        PageInfo pageInfo = iSysUserService.getUserSchool(pageNum,limit,new  QueryWrapper().orderBy(true,true,"user_id"));
        //return Message.success().add("pageInfo", pageInfo);
        return new DataGridView(pageInfo.getTotal(), pageInfo.getList());
    }
    /**
     * 根据id查询用户
     *
     * @param id 用户id
     * @return 用户信息
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Message getEmp(@PathVariable("id") Integer id) {


        SysUser user =iSysUserService.selectLinkById(id);
        log.info("user: {}",user);
        return Message.success().add("user", user);
    }
    /**
     * 添加员工
     *
     * @param sysUser 传入的员工数据
     * @return 新增员工的结果
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    // 由于表单传输的标签内容，标签的name都和sysUser的属性名相同，因此参数可以直接传对象
    @ResponseBody
    public Message saveEmp(@Valid SysUser sysUser, BindingResult result) {

        //校验失败
        if (result.hasErrors()) {
            Map<String, Object> map = new HashMap<String, Object>();

            List<FieldError> errors = result.getFieldErrors();
            for (FieldError fieldError : errors) {
                //错误的字段名 和 错误的信息
                map.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return Message.fail().add("errorFields", map);
        }

        //验证员工姓名
        boolean usable = iSysUserService.checkUser(sysUser.getUserName());
        if (!usable) {
            return Message.fail().add("va_msg", "该姓名已被使用");
        }

        iSysUserService.save(sysUser);
        return Message.success();
    }
    /**
     * 删除员工（单个删除、批量删除都处理）
     */

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Message deleteEmpById(@PathVariable("id") String ids) {

        if (ids.contains("-")) {//批量删除

            List<Integer> del_ids = new ArrayList<Integer>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids){
                del_ids.add(Integer.parseInt(string));
            }
            iSysUserService.removeByIds(del_ids);
        } else {//单个删除
            Integer id = Integer.parseInt(ids);
            iSysUserService.removeById(id);
        }

        return Message.success();
    }
    /**
     * ajax后端表单校验
     *
     * @param userName 传入的员工名
     * @return 返回添加操作的结果
     */
    @RequestMapping("/checkUser")
    @ResponseBody
    public Message checkUser(@RequestParam("userName") String userName) {
        //判断用户名是否合法
        String regx = "^([a-zA-Z0-9_-]{6,16})|(^[\u4e00-\u9fa5]{2,5})$";
        if (!userName.matches(regx)) {
            return Message.fail().add("va_msg", "姓名必须为6-16位数字和字母的组合 或 2-5位中文");
        }

        //数据库用户名重复校验
        boolean usable = iSysUserService.checkUser(userName);
        if (usable) {
            return Message.success().add("va_msg", "该姓名可用");
        }
        return Message.fail().add("va_msg", "该姓名已被使用");
    }
}

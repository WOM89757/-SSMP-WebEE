package com.jcgl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId(type = IdType.AUTO)
    private Integer userId;

    /**
     * 学校编号
     */
    private Integer schoolId;

    /**
     * 角色编号
     */
    private Integer roleId;

    /**
     * 用户名称
     */
    @Pattern(regexp = "^([a-zA-Z0-9_-]{6,16})|(^[\u4e00-\u9fa5]{2,5})$",
            message = "姓名必须为6-16位数字和字母的组合 或 2-5位中文")
    private String userName;

    /**
     * 用户状态
     */

    private String userStatus;


    @TableField(exist = false)
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }



    public SysUser() {
    }


    public SysUser(Integer userId, Integer schoolId, Integer roleId, String userName, String userStatus) {
        this.userId = userId;
        this.schoolId = schoolId;
        this.roleId = roleId;
        this.userName = userName;
        this.userStatus = userStatus;
    }

    public SysUser(Integer userId, Integer schoolId, Integer roleId, String userName, String userStatus, String schoolName) {
        this.userId = userId;
        this.schoolId = schoolId;
        this.roleId = roleId;
        this.userName = userName;
        this.userStatus = userStatus;
        this.schoolName = schoolName;
    }
}

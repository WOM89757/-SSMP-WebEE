package com.jcgl.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 教材征订信息
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TBooksubscription implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教材征订编号
     */
    private Integer subId;

    /**
     * 学校编号
     */
    private Integer schoolId;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 学生订数
     */
    private Integer subStudnum;

    /**
     * 教师订数
     */
    private Integer subTeanum;

    /**
     * 免费订数
     */
    private Integer subFreenum;


}

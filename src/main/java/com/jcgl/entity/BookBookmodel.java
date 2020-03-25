package com.jcgl.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 自编书目_年级套订模型
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BookBookmodel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自编书目编号
     */
    private Integer bookId;

    /**
     * 年级套订编号
     */
    private Integer bmodelId;


}

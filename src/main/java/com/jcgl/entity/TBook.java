package com.jcgl.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 在此期号内建立、修改、删除和向省店上报书目信息
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TBook implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自编书目编号
     */
    private Integer bookId;

    /**
     * 书名
     */
    private String bookName;

    /**
     * 年级
     */
    private String bookGrade;

    /**
     * 版别
     */
    private String bookEdition;

    /**
     * 免费品种
     */
    private String bookFree;

    /**
     * 供货单位
     */
    private String bookPublic;

    /**
     * 分类
     */
    private String bookVariety;


}

package com.think.www.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 代码不写注释，编程不打日志，像极了你和别人吹NB的样子。
 *
 * @author 北桥南望
 * @since 2021-05-25 10:39
 */
public class OrderDetailDTO {

    private Integer id;

    private String orderId;

    private BigDecimal price;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer createBy;

    private Integer updateBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }
}

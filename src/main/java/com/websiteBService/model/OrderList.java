package com.websiteBService.model;

public class OrderList {
    private Long orderId;
    private Long itemId;

    public OrderList(Long orderListId, Long itemId) {
        this.orderId = orderListId;
        this.itemId = itemId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}

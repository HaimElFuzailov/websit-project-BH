package com.websiteBService.model;

public class OrderList {
    private Long orderListId;
    private Long itemId;

    public OrderList(Long orderListId, Long itemId) {
        this.orderListId = orderListId;
        this.itemId = itemId;
    }

    public Long getOrderListId() {
        return orderListId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setOrderListId(Long orderListId) {
        this.orderListId = orderListId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}

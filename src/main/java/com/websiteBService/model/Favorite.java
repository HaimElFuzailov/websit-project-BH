package com.websiteBService.model;

public class Favorite {
    private Long id;
    private Long itemId;

    public Favorite(Long id, Long itemId) {
        this.id = id;
        this.itemId = itemId;
    }

    public Long getId() {
        return id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}

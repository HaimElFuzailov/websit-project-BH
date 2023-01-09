package com.websiteBService.model;

public class FavoriteList {
    private Long favoriteId;
    private Long itemId;

    public FavoriteList(Long favoriteId, Long itemId) {
        this.favoriteId = favoriteId;
        this.itemId = itemId;
    }

    public Long getFavoriteId() {
        return favoriteId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setFavoriteId(Long favoriteId) {
        this.favoriteId = favoriteId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}

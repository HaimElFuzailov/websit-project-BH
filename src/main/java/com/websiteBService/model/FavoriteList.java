package com.websiteBService.model;

public class FavoriteList {
    private Long favoriteListId;
    private Long itemId;

    public FavoriteList(Long favoriteListId, Long itemId) {
        this.favoriteListId = favoriteListId;
        this.itemId = itemId;
    }

    public Long getFavoriteListId() {
        return favoriteListId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setFavoriteListId(Long favoriteListId) {
        this.favoriteListId = favoriteListId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}

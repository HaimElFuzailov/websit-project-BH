package com.websiteBService.repository;

import com.websiteBService.model.Favorite;
import com.websiteBService.model.FavoriteList;

public interface FavoriteListRepository {
    void createFavoriteList(FavoriteList favoriteList);


    void updateFavoriteListById(Long id, FavoriteList favoriteList) throws Exception;

    void deleteFavoriteListById(Long id) throws Exception;

    FavoriteList getFavoriteListById(Long id);
}

package com.websiteBService.service;


import com.websiteBService.model.FavoriteList;

public interface FavoriteListService {

    void createFavoriteList(FavoriteList favoriteList)throws Exception;

    void updateFavoriteListById(Long id, FavoriteList favoriteList) throws Exception;

    void deleteFavoriteListById(Long id) throws Exception;

    FavoriteList getFavoriteListById(Long id);

}

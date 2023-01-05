package com.websiteBService.service;

import com.websiteBService.model.Favorite;

public interface FavoriteService {
    void updateFavoriteById(Long id, Favorite favorite) throws Exception;

    void deleteFavoriteById(Long id) throws Exception;

    Favorite getFavoriteById(Long id);

    void createFavorite(Favorite favorite)throws Exception;
}

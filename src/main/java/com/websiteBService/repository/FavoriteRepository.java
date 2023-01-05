package com.websiteBService.repository;

import com.websiteBService.model.Favorite;

public interface FavoriteRepository {
    void createFavorite(Favorite favorite);


    void updateFavoriteById(Long id, Favorite favorite) throws Exception;

    void deleteFavoriteById(Long id) throws Exception;

    Favorite getFavoriteById(Long id);
}

package com.websiteBService.service;

import com.websiteBService.model.Favorite;
import com.websiteBService.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteServiceImpl implements FavoriteService{
    @Autowired
    FavoriteRepository favoriteRepository;

    @Override
    public void updateFavoriteById(Long id, Favorite favorite) throws Exception {
        favoriteRepository.updateFavoriteById(id, favorite);
    }

    @Override
    public void deleteFavoriteById(Long id) throws Exception {
        favoriteRepository.deleteFavoriteById(id);
    }

    @Override
    public Favorite getFavoriteById(Long id) {
        return favoriteRepository.getFavoriteById(id);
    }

    @Override
    public void createFavorite(Favorite favorite) throws Exception {
        if(favoriteRepository.getFavoriteById(favorite.getId()) != null) {
            favoriteRepository.createFavorite(favorite);
        }
        else {
            throw new Exception("problem with the service");
        }
    }
}

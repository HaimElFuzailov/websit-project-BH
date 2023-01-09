package com.websiteBService.service;

import com.websiteBService.model.FavoriteList;
import com.websiteBService.repository.FavoriteListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteListServiceImpl implements FavoriteListService{
    @Autowired
    FavoriteListRepository favoriteListRepository;
    @Override
    public void createFavoriteList(FavoriteList favoriteList) throws Exception {
        if(favoriteListRepository.getFavoriteListById(favoriteList.getFavoriteId()) != null) {
            favoriteListRepository.createFavoriteList(favoriteList);
        }
        else {
            throw new Exception("problem with the service");
        }
    }

    @Override
    public void updateFavoriteListById(Long id, FavoriteList favoriteList) throws Exception {
        favoriteListRepository.updateFavoriteListById(id, favoriteList);
    }

    @Override
    public void deleteFavoriteListById(Long id) throws Exception {
        favoriteListRepository.deleteFavoriteListById(id);
    }

    @Override
    public FavoriteList getFavoriteListById(Long id) {
        return favoriteListRepository.getFavoriteListById(id);
    }
}

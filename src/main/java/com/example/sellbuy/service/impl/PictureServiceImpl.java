package com.example.sellbuy.service.impl;

import com.example.sellbuy.model.entity.PictureEntity;
import com.example.sellbuy.repository.PictureRepository;
import com.example.sellbuy.service.PictureService;
import com.example.sellbuy.service.ProductService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PictureServiceImpl implements PictureService {

    private final PictureRepository pictureRepository;
    private final ProductService productService;

    public PictureServiceImpl(PictureRepository pictureRepository, @Lazy ProductService productService) {
        this.pictureRepository = pictureRepository;
        this.productService = productService;
    }

    @Override
    public PictureEntity addPictureEntity(PictureEntity picture1) {
        return pictureRepository.save(picture1);
    }

    @Override
    public PictureEntity getFirstPicture() {
        return pictureRepository.findAll().get(0);
    }

    @Override
    public PictureEntity addPictureInDb(PictureEntity pictureEntity) {

        return this.pictureRepository.save(pictureEntity);
    }


    @Override
    public void deletePictureById(Long id) {
        if (this.pictureRepository.findById(id).isPresent()){
            this.pictureRepository.deleteById(id);
        }

    }

    @Override
    public Optional<PictureEntity> findByUrl(String urlPicture) {
       return this.pictureRepository.findByUrl(urlPicture);
    }

    @Override
    public void deleteOldPictureById(Long id) {
        this.pictureRepository.deleteById(id);
    }

}
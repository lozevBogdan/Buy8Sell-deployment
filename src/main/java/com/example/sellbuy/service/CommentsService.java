package com.example.sellbuy.service;

import com.example.sellbuy.model.binding.CommentBindingDto;
import com.example.sellbuy.model.entity.CommentEntity;

public interface CommentsService {


    void deleteCommentByProductId(Long id);

    CommentEntity saveComment(CommentBindingDto commentBindingDto, Long productId, Long AuthorId);
}

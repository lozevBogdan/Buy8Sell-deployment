package com.example.sellbuy.service;

import com.example.sellbuy.model.binding.UserRegisterBindingModel;
import com.example.sellbuy.model.entity.ProductEntity;
import com.example.sellbuy.model.entity.UserEntity;
import com.example.sellbuy.model.view.productViews.ProductFavoriteViewModel;
import com.example.sellbuy.model.view.userViews.UserEditViewModel;
import com.example.sellbuy.model.view.userViews.UserInfoViewModel;

import java.util.List;
import java.util.Set;

public interface UserService {

    void initializeUsersAndRoles();

    UserEntity getByEmail(String email);

    boolean isEmailFree(String email);

    boolean isExistUserWithEmailAndPassword(String email,String password);

    void makeNewRegistration(UserRegisterBindingModel userRegisterBindingModel);

    UserEntity getCurrentLoggedInUserEntityById(Long sellAndBuyUser);

    UserEntity addInDb(UserEntity currentUser);

//    void addFavorProduct(ProductEntity product);

    Set<ProductEntity> getFavorListOf(Long id);

    Set<ProductEntity> getMyProductsById(Long id);

    void deleteUserByProductIdFromUserProduct(ProductEntity id);

    UserEntity findById(Long authorId);

    UserEditViewModel findByIdUserEditViewModel(Long id);

    UserEntity updateUserByIdWithUserEditViewModel(Long userId,UserEditViewModel userEditViewModel);

    boolean isThisIsOldPasswordByUserId(String oldPassword, Long userId);

    UserEntity changePasswordByUserId(String newPassword, Long id);

    boolean isNewPasswordIsEqualToOldPassByUserId(String newPassword, Long id);

    List<UserInfoViewModel> getAllUsers();

    UserInfoViewModel getUserInfoViewModelByUserId(Long userId);

    UserEntity updateUserByIdWithUserInfoViewModelAndIsAmin(Long userId, UserInfoViewModel userInfoViewModel, boolean isAdmin);

    List<ProductFavoriteViewModel> returnFavors(Set<ProductEntity> favorProducts, Long userId);

    List<ProductFavoriteViewModel> returnFavoritesViwModels(Long userId);

    boolean checkByIdIsAdmin(Long id);
}

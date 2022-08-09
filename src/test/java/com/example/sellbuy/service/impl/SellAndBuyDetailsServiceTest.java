package com.example.sellbuy.service.impl;

import com.example.sellbuy.model.entity.UserEntity;
import com.example.sellbuy.model.entity.UserRoleEntity;
import com.example.sellbuy.model.entity.enums.UserRoleEnum;
import com.example.sellbuy.repository.UserRepository;
import com.example.sellbuy.securityUser.SellAndBuyUserDetails;
import com.example.sellbuy.service.UserService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SellAndBuyDetailsServiceTest {

    @Mock
    private UserRepository mockUserRepo;

    private SellAndBuyDetailService toTest;

    @BeforeEach
    void setUp(){
        toTest = new SellAndBuyDetailService(mockUserRepo);
    }
    @Test
    void testLoadUserByUsername_UserExist(){

        //Arrange

        UserEntity testUserEntity = new UserEntity().
                setEmail("test@abv.bg").
                setLastName("Testov").
                setFirstName("Test").
                setMobileNumber("0888888888").
                setPassword("072829ea6e6bdfe72f78898a53aa990b1b810994424b4166e36ad7b3c0832e17cb53e046bab3ba0c").
                setRoles(Set.of(
                        new UserRoleEntity().setRole(UserRoleEnum.ADMIN),
                        new UserRoleEntity().setRole(UserRoleEnum.USER)
                ));

        when(mockUserRepo.findByEmail(testUserEntity.getEmail())).
                thenReturn(Optional.of(testUserEntity));

        //Act

        SellAndBuyUserDetails userDetails = (SellAndBuyUserDetails)
                toTest.loadUserByUsername(testUserEntity.getEmail());

        //Assert

        Assertions.assertEquals(testUserEntity.getEmail(),userDetails.getUsername());
        Assertions.assertEquals(testUserEntity.getFirstName(),userDetails.getFirstName());
        Assertions.assertEquals(testUserEntity.getLastName(),userDetails.getLastName());
        Assertions.assertEquals(testUserEntity.getPassword(),userDetails.getPassword());
        Assertions.assertEquals(2,userDetails.getAuthorities().size());

    }

    @Test
    void testLoadUserByUsername_UserDoesNotExist(){

        // without arrange, because mockUserRepo will return empty Optional
       Assertions.assertThrows(
               UsernameNotFoundException.class,
               ()-> toTest.loadUserByUsername("no-exist-user")
       );
    }

}

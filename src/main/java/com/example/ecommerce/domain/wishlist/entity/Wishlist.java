package com.example.ecommerce.domain.wishlist.entity;


import com.example.ecommerce.global.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Wishlist extends BaseEntity {

    private Long userId;

    private Long productId;

}
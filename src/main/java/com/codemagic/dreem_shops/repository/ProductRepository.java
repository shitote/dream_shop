package com.codemagic.dreem_shops.repository;

import com.codemagic.dreem_shops.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.vn.mobileshop.client.DAO;

import com.vn.mobileshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product , Long> {
}

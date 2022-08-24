package com.vn.mobileshop.client.DAO;

import com.vn.mobileshop.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandDAO extends JpaRepository<Brand , Long> {
}

package com.enviro.assessment.grad001.alithembamakongwana.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByType(ProductType type);
    List<Product> findByInvestorId(Long investorId);
}

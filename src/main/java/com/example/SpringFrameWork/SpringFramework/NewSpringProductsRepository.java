

package com.example.SpringFrameWork.SpringFramework;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewSpringProductsRepository extends JpaRepository<NewSpringProductsModel, Integer> {
    // You can define custom queries here if needed

    // Example: Find products by category
    List<NewSpringProductsModel> findByCategory(String category);
}




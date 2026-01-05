package com.somuncu.FoodApp.menu.repository;

import com.somuncu.FoodApp.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MenuRepository extends JpaRepository<Menu, Long> , JpaSpecificationExecutor<Menu> {
}

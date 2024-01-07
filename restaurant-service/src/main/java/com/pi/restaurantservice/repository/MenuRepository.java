package com.pi.restaurantservice.repository;

import org.springframework.stereotype.Repository;

import com.pi.restaurantservice.model.Menu;
import java.util.ArrayList;
import java.util.List;


public class MenuRepository {
    private List<Menu> menus = new ArrayList<>();

    public Menu addMenu(Menu menu) {
        menus.add(menu);
        return menu;
    }

    public Menu findById(Long id) {
        return menus.stream().filter(menu -> menu.getId().equals(id)).findFirst().orElseThrow();
    }

    public List<Menu> findAll() {
        return menus;
    }

    public Menu editMenu(Long id, Menu menu) {
        Menu menuToEdit = findById(id);
        menuToEdit.edit(menu);
        return menuToEdit;
    }

    public Menu deleteMenu(Long id) {
        Menu menuToDelete = findById(id);
        menus.remove(menuToDelete);
        return menuToDelete;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicio;

import com.example.demo.Entities.Category;
import com.example.demo.Repositorio.CategoryRepositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class CategoryServicio {
    @Autowired
     private CategoryRepositorio categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int categoryId) {
        return categoryRepository.getCategory(categoryId);
    }

    public Category save(Category category) {
        if (category.getIdCategory() == null) {
            return categoryRepository.save(category);
        } else {
            Optional<Category> category1 = categoryRepository.getCategory(category.getIdCategory());
            if (category1.isEmpty()) {
                return categoryRepository.save(category);
            } else {
                return category;
            }
        }
    }
    
    public Category update(Category category){
        if(category.getIdCategory()!=null){
            Optional<Category>g=categoryRepository.getCategory(category.getIdCategory());
            if(!g.isEmpty()){
                if(category.getDescription()!=null){
                    g.get().setDescription(category.getDescription());
                }
                if(category.getName()!=null){
                    g.get().setName(category.getName());
                }
                return categoryRepository.save(g.get());
            }
        }
        return category;
    }
    
    
    public boolean deleteCategory(int categoryId){
      Optional<Category> category = categoryRepository.getCategory(categoryId);
        if (category.isEmpty()) {
            return false;
        } else {
            categoryRepository.delete(category.get());
            return true;   
    
    
    
    }
    }
    
    
}

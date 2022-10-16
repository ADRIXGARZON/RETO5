/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.CrudRepository;

import com.example.demo.Entities.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface CategoryInterface extends CrudRepository <Category, Integer>{
    
}

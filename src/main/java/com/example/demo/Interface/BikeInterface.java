/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import com.example.demo.entities.Bike;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface BikeInterface extends CrudRepository <Bike, Integer> {
    
}

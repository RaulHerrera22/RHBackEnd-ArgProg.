/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioRH.Repository;

import com.portfolioRH.Entity.HardSkills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RHardSkills extends JpaRepository <HardSkills, Integer> {
    Optional <HardSkills> findByNombre (String nombre);
    public boolean existsByNombre (String nombre);
}
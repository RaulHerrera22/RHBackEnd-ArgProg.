/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioRH.Service;

import com.portfolioRH.Entity.HardSkills;
import com.portfolioRH.Repository.RHardSkills;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SHardSkills {

    @Autowired
    RHardSkills rhys;

    public List<HardSkills> list() {
        return rhys.findAll();
    }

    public Optional<HardSkills> getOne(int id) {
        return rhys.findById(id);
    }

    public Optional<HardSkills> getByNombre(String nombre) {
        return rhys.findByNombre(nombre);
    }

    public void save(HardSkills hys) {
        rhys.save(hys);
    }

    public void delete(int id) {
        rhys.deleteById(id);
    }

    public boolean existsById(int id) {
        return rhys.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return rhys.existsByNombre(nombre);
    }
}

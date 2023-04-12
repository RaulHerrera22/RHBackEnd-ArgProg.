/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioRH.Dto;

import jakarta.validation.constraints.NotBlank;

 public class DtoHyS {
    
     @NotBlank
    private int porcentaje;
     @NotBlank
    private String nombre;

    public DtoHyS() {
    }

    public DtoHyS(int porcentaje, String nombre) {
        this.porcentaje = porcentaje;
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
     
}

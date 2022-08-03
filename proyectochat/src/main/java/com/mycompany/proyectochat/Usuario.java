/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectochat;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class Usuario implements  ManejarInformacion
{   private int id;
    private String nombre;
    private String contraseña;
    private String CorreoElectronico;
    private int Edad;

    public Usuario(int id, String nombre, String contraseña, String CorreoElectronico, int Edad) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.CorreoElectronico = CorreoElectronico;
        this.Edad = Edad;
    }

  

  
    public Usuario() {
        this.id=id+1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public void agregardatos() {
        JOptionPane.showMessageDialog(null, toString());
    }
  
    @Override
    public void mostrarDatos() {
   
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", contrase\u00f1a=" + contraseña + '}';
    }
 
    public void hola(){}
}

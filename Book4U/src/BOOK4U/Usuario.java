/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOOK4U;

import java.sql.Blob;

/**
 *
 * @author Pau
 */
public class Usuario {
  int id;
  String name;
  String email;
  String password;
  Blob image;
  int coins;
  String dni;
  String surname;
  String adress;
  boolean active;

    public Usuario(int id, String name, String email, String password, Blob image, int coins, String dni, String surname, String adress, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.image = image;
        this.coins = coins;
        this.dni = dni;
        this.surname = surname;
        this.adress = adress;
        this.active = active;
    }
  
  @Override
public String toString() {
    return "Usuario{" +
           "id=" + id +
           ", name='" + name + '\'' +
           ", email='" + email + '\'' +
           ", password='" + password + '\'' +
           ", image='" + image + '\'' +
           ", coins=" + coins +
           ", dni='" + dni + '\'' +
           ", surname='" + surname + '\'' +
           ", adress='" + adress + '\'' +
           ", active=" + active +
           '}';
}
}

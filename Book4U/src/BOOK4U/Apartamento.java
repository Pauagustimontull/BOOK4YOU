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
import java.sql.Blob;

public class Apartamento {

    public int id;
    private Blob image;
    private String name;
    private int price;
    private String place;
    private boolean avaliable;
    private String city;
    private int id_owner;

    public Apartamento(int id, String name, Blob image, int price, String place, boolean avaliable, String city, int id_owner) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.place = place;
        this.avaliable = avaliable;
        this.city = city;
        this.id_owner = id_owner;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getPlace() {
        return place;
    }

    public Blob getImage() {
        return image;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Apartamento{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", image='" + image + '\''
                + ", price=" + price
                + ", place='" + place + '\''
                + ", available=" + avaliable
                + ", city='" + city + '\''
                + ", id_owner=" + id_owner
                + '}';
    }
}

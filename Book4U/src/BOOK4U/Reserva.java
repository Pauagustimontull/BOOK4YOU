/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOOK4U;

import java.util.Date;

public class Reserva {
    private int id;
    private String name;
    private double price;
    private int id_user;
    private String place;
    private int id_historic;
    private Date datee;
    private int id_apartment;
    private int paid;
    private int status;
    private Date dates;

    public Reserva(int id, String name, double price, int id_user, String place, int id_historic, Date datee,
                   int id_apartment, int paid, int status, Date dates) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.id_user = id_user;
        this.place = place;
        this.id_historic = id_historic;
        this.datee = datee;
        this.id_apartment = id_apartment;
        this.paid = paid;
        this.status = status;
        this.dates = dates;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId_user() {
        return id_user;
    }

    public String getPlace() {
        return place;
    }

    public int getId_historic() {
        return id_historic;
    }

    public Date getDatee() {
        return datee;
    }

    public int getId_apartment() {
        return id_apartment;
    }

    public int getPaid() {
        return paid;
    }

    public int getStatus() {
        return status;
    }

    public Date getDates() {
        return dates;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", id_user=" + id_user +
                ", place='" + place + '\'' +
                ", id_historic=" + id_historic +
                ", datee=" + datee +
                ", id_apartment=" + id_apartment +
                ", paid=" + paid +
                ", status=" + status +
                ", dates=" + dates +
                '}';
    }
}

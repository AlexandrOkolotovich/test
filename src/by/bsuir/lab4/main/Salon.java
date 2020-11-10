package by.bsuir.lab4.main;

public class Salon implements Copyable {
    String name;
    String country;
    String address;
    String services;
    String session;
    String price;
    String val;

    public Salon(String name, String country, String address, String services, String session, String price, String val) {
        this.name = name;
        this.country = country;
        this.address = address;
        this.services = services;
        this.session = session;
        this.price = price;
        this.val = val;
    }

    public Copyable copy() {
        Salon copy = new Salon(name, country, address, services, session, price, val);
        return copy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}

package com.kodilla.good.patterns.challenges;

public class Client {

    private String name;
    private String surname;
    private String address;

    public Client(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Client{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", adres='" + address + '\'' + '}';
    }
}

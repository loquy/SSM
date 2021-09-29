package com.pojo;

import java.util.*;

public class Student {

    private String name;
    private Address address;
    private String[] books;
    private List<String> hobby;
    private Map<String, String> card;
    private Set<String> games;
    private String wife;
    private Properties info;


    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String[] getBooks() {
        return books;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public Set<String> getGames() {
        return games;
    }

    public String getWife() {
        return wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", books=" + Arrays.toString(books) +
                ", hobby=" + hobby +
                ", card=" + card +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }
}

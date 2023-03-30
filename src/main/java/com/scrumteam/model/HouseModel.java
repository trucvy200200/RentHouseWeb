package com.scrumteam.model;

public class HouseModel {
    private  int houseid;
    private int iduser;
    private String title;
    private int number;
    private String city;
    private float cost;
    private String description;
    private String area;
    private String image;

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public HouseModel(int houseid, int iduser, String title, int number, String city, float cost, String description, String area, String image) {
        this.houseid = houseid;
        this.iduser = iduser;
        this.title = title;
        this.number = number;
        this.city = city;
        this.cost = cost;
        this.description = description;
        this.area = area;
        this.image = image;
    }
}

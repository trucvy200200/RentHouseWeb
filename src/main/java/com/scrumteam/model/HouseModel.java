package com.scrumteam.model;

public class HouseModel {
    private  int houseid;
    private int iduser;
    private String title;
    private String number;
    private String street;
    private String district;
    private String city;
    private float cost;
    private String description;
    private String area;
    private String image;

    public HouseModel(int houseid, int iduser, String title, String number, String street, String district, String city, float cost, String description, String area, String image) {
        this.houseid = houseid;
        this.iduser = iduser;
        this.title = title;
        this.number = number;
        this.street = street;
        this.district = district;
        this.city = city;
        this.cost = cost;
        this.description = description;
        this.area = area;
        this.image = image;
    }

    public HouseModel() {
    }

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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
    

   
}

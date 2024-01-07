package com.pi.restaurantservice.model;

public class Menu {
    private Long id;
    private String name;
    private String description;
    private String price;
    private String image;

    public Menu() {
    }

    public Menu(Long id, String name, String description, String price, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }


    @Override
    public String toString() {
        return "Menu [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", image=" + image + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Menu edit(Menu menu) {
        this.name = menu.getName();
        this.description = menu.getDescription();
        this.price = menu.getPrice();
        this.image = menu.getImage();
        return this;
    }
    
}

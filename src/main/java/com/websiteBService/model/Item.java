package com.websiteBService.model;

public class Item {
    private Long id;
    private String titleOfTheItem;
    private String photoOfTheItem;
    private Long price;
    private Long howMuchItemsAvailableInStock;

    public Item(Long id, String titleOfTheItem, String photoOfTheItem, Long price, Long howMuchItemsAvailableInStock) {
        this.id = id;
        this.titleOfTheItem = titleOfTheItem;
        this.photoOfTheItem = photoOfTheItem;
        this.price = price;
        this.howMuchItemsAvailableInStock = howMuchItemsAvailableInStock;
    }



    public Long getId() {
        return id;
    }

    public String getTitleOfTheItem() {
        return titleOfTheItem;
    }

    public String getPhotoOfTheItem() {
        return photoOfTheItem;
    }

    public Long getPrice() {
        return price;
    }

    public Long getHowMuchItemsAvailableInStock() {
        return howMuchItemsAvailableInStock;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

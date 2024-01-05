package com.pi.orderservice.model;

public class DeliveryInfo {
    
    private String deliveryTime;
    private String deliveryAdress;

    public String getDeliveryTime() {
        return deliveryTime;
    }
    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    public String getDeliveryAdress() {
        return deliveryAdress;
    }
    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }
    public DeliveryInfo(String deliveryTime, String
    deliveryAdress) {
        this.deliveryTime = deliveryTime;
        this.deliveryAdress = deliveryAdress;
    }
}

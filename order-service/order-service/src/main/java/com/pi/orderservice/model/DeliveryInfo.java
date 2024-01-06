package com.pi.orderservice.model;

public class DeliveryInfo {

    private int deliveryTime;
    private String deliveryAddress;

    public DeliveryInfo(int deliveryTime, String deliveryAddress) {
        this.deliveryTime = deliveryTime;
        this.deliveryAddress = deliveryAddress;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "DeliveryInfo [deliveryTime=" + deliveryTime + ", deliveryAddress=" + deliveryAddress + "]";
    }

}

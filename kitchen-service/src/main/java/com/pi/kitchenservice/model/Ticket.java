package com.pi.kitchenservice.model;

public class Ticket {
    private Long id;
    private String state;
    private Long restaurantId;
    private String preparingTime;
    private String pickedUpTime;

    public Ticket(Long id, String state, Long restaurantId, String preparingTime, String pickedUpTime) {
        this.id = id;
        this.state = state;
        this.restaurantId = restaurantId;
        this.preparingTime = preparingTime;
        this.pickedUpTime = pickedUpTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getPreparingTime() {
        return preparingTime;
    }

    public void setPreparingTime(String preparingTime) {
        this.preparingTime = preparingTime;
    }

    public String getPickedUpTime() {
        return pickedUpTime;
    }

    public void setPickedUpTime(String pickedUpTime) {
        this.pickedUpTime = pickedUpTime;
    }

    @Override
    public String toString() {
        return "Ticket [id=" + id + ", state=" + state + ", restaurantId=" + restaurantId + ", preparingTime="
                + preparingTime + ", pickedUpTime=" + pickedUpTime + "]";
    }

}

package com.pi.kitchenservice.model;

public class Ticket {

    enum State {
        PREPARING, READY, PICKED_UP, DELIVERED, CANCELED, ACCEPTED
    }

    private Long id;
    private State state;
    private Long restaurantId;
    private String preparingTime;
    private String pickedUpTime;

    public Ticket(Long id, State state, Long restaurantId, String preparingTime, String pickedUpTime) {
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
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

    public void edit(Ticket ticket) {
        this.state = ticket.getState();
        this.restaurantId = ticket.getRestaurantId();
        this.preparingTime = ticket.getPreparingTime();
        this.pickedUpTime = ticket.getPickedUpTime();
    }

    public void ready() {
        this.state = State.READY;
    }

    public void pickedUp() {
        this.state = State.PICKED_UP;
    }

    public void accepted() {
        this.state = State.ACCEPTED;
    }




    @Override
    public String toString() {
        return "Ticket [id=" + id + ", state=" + state + ", restaurantId=" + restaurantId + ", preparingTime="
                + preparingTime + ", pickedUpTime=" + pickedUpTime + "]";
    }

}

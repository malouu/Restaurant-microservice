package com.pi.orderservice.model;

public class Order {

   enum State {
        created, accepted, canceled, ready
    }

    private Long id;
    // order has a state. state can be one of the following: created, accepted,
    // canceled, ready.

    private State state;
    private Long customerId;
    private Long restaurantId;

    public Order(Long id, State state, Long customerId, Long restaurantId) {
        this.id = id;
        this.state = state;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", state=" + state + ", customerId=" + customerId + ", restaurantId=" + restaurantId
                + "]";
    }

    public void cancel() {
        this.state = State.canceled;
    }

    public void accept() {
        this.state = State.accepted;
    }

    public void ready() {
        this.state = State.ready;
    }

    public void create() {
        this.state = State.created;
    }

    public void revise(Order order) {
        this.customerId = order.getCustomerId();
        this.restaurantId = order.getRestaurantId();
        this.state = order.getState();
    }
}

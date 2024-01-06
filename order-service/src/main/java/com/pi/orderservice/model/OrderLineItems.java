package com.pi.orderservice.model;

public class OrderLineItems {
    private Long id;
    private int quantity;
    private Long idMenu;
    private Long idOrder;

    public OrderLineItems(Long id, int quantity, Long idMenu, Long idOrder) {
        this.id = id;
        this.quantity = quantity;
        this.idMenu = idMenu;
        this.idOrder = idOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    @Override
    public String toString() {
        return "OrderLineItems [id=" + id + ", quantity=" + quantity + ", idMenu=" + idMenu + ", idOrder=" + idOrder
                + "]";
    }
}

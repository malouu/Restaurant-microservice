package com.pi.orderservice.model;

public class OrderLineItems {

    private Long id;
    private int quantite;
    private Long idMenu;
    private Long idOrder;

    public Long getId() {
        return id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Long getIdOrder() {
        return idOrder;
    }
    public void  idOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }
}

package main.java.com.pi.kitchenservice.model;

public class LineItems {
    private Long id;
    private int quantity;
    private Long idMenu;
    private Long idTicket;

    public LineItems(Long id, int quantity, Long idMenu, Long idTicket) {
        this.id = id;
        this.quantity = quantity;
        this.idMenu = idMenu;
        this.idTicket = idTicket;
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

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }

    @Override
    public String toString() {
        return "LineItems [id=" + id + ", quantity=" + quantity + ", idMenu=" + idMenu + ", idTicket=" + idTicket + "]";
    }

}

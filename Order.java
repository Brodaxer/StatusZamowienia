

class Order {
    private String name;
    private double price;
    private Status status;


    public Order(String name, double price, Status status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public String getDescription(){
        return status.getDescripiton();
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name  +
                " (" + price +
                ") " + status.getDescripiton() ;
    }

}

enum Status {
    NEW("Nowe"), PAID("Oplacone"), SHIPPED("Wyslane"),
    DELIVERED("Dostarczone"), CANCELED("Anulowane");

    private String descripiton;

    Status(String description) {
        this.descripiton = description;
    }

    public String getDescripiton() {
        return descripiton;
    }


}

package org.example.Task5;
public class PizzaOrder {
    private String title;

    public enum Size {
        SMALL(false),
        MEDIUM(false),
        BIG(false);
        public boolean size;

        Size(boolean size) {
            this.size = size;
        }

        public void setMEDIUM(boolean size) {
            this.size = size;
        }

        public void setBIG(boolean size) {
            this.size = size;
        }

        public void setSMALL(boolean size) {
            this.size = size;
        }

    }

    private boolean isSauce;
    Size size;
    private String address;
    private boolean isOrderAccepted = false;

    public PizzaOrder(String title, Size size, String address) {
        this.title = title;
        this.size = size;
        this.address = address;
    }

    public PizzaOrder() {

    }

    public void order() {
        if (isOrderAccepted == true) System.out.println("Заказ уже принят");
        else {
            isOrderAccepted = true;
            System.out.println("Заказ принят. ");
            if (size == size.BIG) System.out.print("Большая ");
            else if (size == size.MEDIUM) System.out.print("Средняя ");
            else System.out.print("Маленькая ");
            System.out.print("пицца " + title);
            if (isSauce == true) System.out.print(" с соусом");
            else System.out.print(" без соуса");
            System.out.println(" на адрес " + address + ". ");
        }
    }

    public void cancel() {
        if (isOrderAccepted == false) System.out.println("Заказ отменен или заказ не был принят");
    }

    public String getTitle() {
        return title;
    }

    public Size getSize() {
        return size;
    }

    public boolean getIsSauce() {
        return isSauce;
    }

    public String getAddress() {
        return address;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsSauce(boolean isSauce) {
        this.isSauce = isSauce;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //метод отмены заказа toString1
    public void toString(boolean a) {
        isOrderAccepted = false;
    }
}

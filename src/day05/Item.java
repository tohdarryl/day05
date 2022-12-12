package day05;

public class Item {
    public static String name;
    public static Integer quantity; //static means that if the last setQuantity is 3 then all instance will have quantity of 3

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Integer getQuantity() {
        return quantity;
    }

    public static void setQuantity(Integer quantity) {
        Item.quantity = quantity;
    }

    //Singleton pattern
    //Creating your own constructor




    
    
}

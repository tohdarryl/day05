package day05;

public class StaticInstance {
    public static void main(String[] args) {
        //no static is an instance method
        //a 'final' class cannot be a subclass

        final Integer version = 10;
        //version = 5; cannot run as once version is set as final, cannot be overriden

        //access static member without instantiating the class
        Item.quantity = 100;
        

        Item apple = new Item();
        apple.setName("apple");

        Item orange = new Item();
        orange.setName("orange");

        System.out.println("apple: " + apple.getName() + apple.getQuantity());
        System.out.println("orange: " + orange.getName() + orange.getQuantity());
        
    }



}
package Anli.Test;

public class Phonedemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand="apple";
        p.price=5999;
        System.out.println(p.price);
        System.out.println(p.brand);
        p.call();
        p.sendmessage();
    }
}

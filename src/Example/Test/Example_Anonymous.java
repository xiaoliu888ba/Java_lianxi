package Example.Test;

public class Example_Anonymous {
    public static void main(String[] args) {
    Outer outer = new Outer("Anonymous");
    outer.anonymous();
    }
}
class Outer{
    private String name;
    Outer(String name){
        this.name= name;
    }
    void anonymous(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello "+Outer.this.name);
            }
        };
        new Thread(r).start();
    }
}

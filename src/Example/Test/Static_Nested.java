package Example.Test;

public class Static_Nested {
    public static void main(String[] args) {
    Out.Static_Nested no = new Out.Static_Nested();
    no.hello();
    }
}
class Out{
    private static String NAME = "OUTER";
    private String name;
    Out(String name){
        this.name=name;    }
    static class Static_Nested{
        void hello(){
            System.out.println("hello "+Out.NAME);
        }
    }
}
package Example.Test;

public class SmallTest {
    public SmallTest(){
        System.out.println("1111");
    }
    public SmallTest(int a){
        this();
        System.out.println("2222");
    }
    public SmallTest(boolean b){
        this(1);
        System.out.println("3333");
    }

    public static void main(String[] args) {
        SmallTest test = new SmallTest(true);
    }
}

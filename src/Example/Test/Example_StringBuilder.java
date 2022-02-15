package Example.Test;

public class Example_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(1024);
        for ( int i = 0 ;i <1000;i++){
            sb.append(i);
            sb.append(",");
        }
        System.out.println(sb);
        StringBuilder ss = new StringBuilder(1024);
        ss.append("Mr").append("Bob").append("!").insert(0,"hello,");
        System.out.println(ss.toString());

        Adder adder = new Adder();
        adder.add(3).add(5).inc().add(10);
        System.out.println(adder.value());
    }
}
class Adder{
    private int sum = 0;
    public Adder add(int n){
        sum += n;
        return this;
    }

    public Adder inc(){
        sum++;
        return this;
    }

    public int value(){
        return sum;
    }
}
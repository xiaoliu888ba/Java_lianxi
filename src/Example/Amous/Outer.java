package Example.Amous;

public class Outer {
    public void method(){
        new Inner(){
            @Override
            public void show() {
                System.out.println("到底是为什么呢");
            }
        }.show();

    }
}

package Anli.Person;

import javax.smartcardio.TerminalFactory;

public class Teach extends Person{
    public Teach() {
    }

    public Teach(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println(super.getName()+"教书育人\n");
    }
}

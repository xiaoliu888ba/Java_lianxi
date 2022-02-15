package Anli.PlayerandCoach;
/*
       测试类
 */
public class Demo {
    public static void main(String[] args) {
        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(23);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();

        System.out.println("\n------------------------\n");


        PingpangPlayer pp = new PingpangPlayer("马龙",31);
        System.out.println(pp.getName()+"  "+pp.getAge());
        pp.eat();
        pp.study();
        pp.studyEnglish();

        System.out.println("\n------------------------\n");

        BasketballCoach bc = new BasketballCoach("Pat Riley",43);
        System.out.println(bc.getName()+"  "+bc.getAge());
        bc.eat();
        bc.teach();

        System.out.println("\n------------------------\n");

        PingpangCoach pc = new PingpangCoach("刘国栋",45);
        System.out.println(pc.getName()+"  "+pc.getAge());
        pc.eat();
        pc.teach();
        pc.studyEnglish();
    }
}

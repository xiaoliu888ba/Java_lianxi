package Anli.PlayerandCoach;

public class PingpangCoach extends Coach implements StudyEnglish{
    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃汉堡");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球教练也要学英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教运动员击球 和 回板。");
    }
}

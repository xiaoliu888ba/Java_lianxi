package Anli.PlayerandCoach;

public class PingpangPlayer extends Player implements StudyEnglish{
    public PingpangPlayer() {
    }

    public PingpangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃蛋");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员需要学英语");
    }

    @Override
    public void study() {
        System.out.println("从教练哪里学习战术");
    }
}

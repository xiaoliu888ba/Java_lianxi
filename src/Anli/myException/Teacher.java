package Anli.myException;

public class Teacher {
    public void chechsorce(int sorce) throws SorceException {
        if (sorce <0 || sorce >100){
            throw new SorceException("输入的成绩有误，应该在0-100之间");
        }else{
            System.out.println("正常");
        }

    }
}

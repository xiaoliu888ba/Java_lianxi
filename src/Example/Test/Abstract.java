package Example.Test;

public class Abstract {
    public static void main(String[] args) {
    Income[] income = new Income[]{new Salary(7500),new Gaofei(12000)};
    double total=0;
    for (Income i : income){
        total += i.getTax();
    }
        System.out.println(total);
    }
}
abstract class Income{
    protected double income;
    public Income(double income){
        this.income=income;
    }
    public abstract double getTax();
}
class Salary extends Income{
    public Salary(double income){
        super(income);
    }
    @Override
    public double getTax(){
        if (income<5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
}
class Gaofei extends Income{
    public Gaofei(double income){
        super(income);
    }
    @Override
    public double getTax(){
        return income * 0.2;
    }
}
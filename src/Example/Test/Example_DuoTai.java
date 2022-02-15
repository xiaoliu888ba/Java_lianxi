package Example.Test;

public class Example_DuoTai {
    public static void main(String[] args) {
        // 给一个有普通收入、工资收入和稿费收入的小伙伴算税:
        Income1[] Income1s = new Income1[] {
                new Income1(3000),
                new Salary1(7500),
                new Gaofei1(12000)
        };
        System.out.println(totalTax(Income1s));
    }

    public static double totalTax(Income1... Income1s) {
        double total = 0;
        for (Income1 Income1: Income1s) {
            total = total + Income1.getTax();
        }
        return total;
    }
}

class Income1 {
    protected double Income1;

    public Income1(double Income1) {
        this.Income1 = Income1;
    }

    public double getTax() {
        return Income1 * 0.1; // 税率10%
    }
}

class Salary1 extends Income1 {
    public Salary1(double Income1) {
        super(Income1);
    }

    @Override
    public double getTax() {
        if (Income1 <= 5000) {
            return 0;
        }
        return (Income1 - 5000) * 0.2;
    }
}

class Gaofei1 extends Income1 {
    public Gaofei1(double Income1) {
        super(Income1);
    }

    @Override
    public double getTax() {
        return Income1*0.2;//税率20%
}
}
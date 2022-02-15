package Example.packageclass;

public class Change {
    public static void main(String[] args)
    {
        int i=1;
        String s = String.valueOf(i);
        System.out.println(s);
        System.out.println(getType(s));

        String str = "7";
        Integer j = Integer.valueOf(str);
        System.out.println(j);
        System.out.println(getType(j));

        Integer integer = new Integer(i);
        Integer integer1 = new Integer(str);
        System.out.println(integer);
        System.out.println(integer1);

        //通过包装类的静态方法parseXxx()将字符串专换为基本数据类型
        int parseInt = Integer.parseInt(str);
        System.out.println(parseInt);

        //通过包装类的toString()方法将包装类专换成字符串
        String s1 = j.toString();
        System.out.println(s1);

    }
    public static String getType(Object o){ //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}

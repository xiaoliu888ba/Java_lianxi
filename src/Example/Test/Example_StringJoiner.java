package Example.Test;

import java.util.StringJoiner;

public class Example_StringJoiner {
    public static void main(String[] args) {
        String [] name= {"Bob", "Alice", "Grace"};
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        for (String n :name){
            sb.append(n).append(",");
        }
        sb.delete(sb.length() - 1,sb.length());
        sb.append("!");

        //StringJoiner(分隔符，开头，结尾)
        StringJoiner sj = new StringJoiner("|","Hello|","!");
        for (String nn :name){
            sj.add(nn);
        }
        String s = String.join(",",name);
        System.out.println(sb);
        System.out.println(sj.toString());
        System.out.println(s);
    }
}

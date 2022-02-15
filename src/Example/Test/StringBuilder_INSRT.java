package Example.Test;

public class StringBuilder_INSRT {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        System.out.println(
                "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)".equals(insert) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        StringBuilder x = new StringBuilder(1024);
        for (int field = 0; field < fields.length; field++) {
            if (field == 0){
                x.insert(0, " (");
            }else {
                x.append(", ");
            }
            x.append(fields[field]);
            if (field == (fields.length - 1)){
                x.append(") VALUES (?, ?, ?)");
            }
        }
        x.insert(0, table)
                .insert(0, "INSERT INTO ");
        return x.toString();}
}

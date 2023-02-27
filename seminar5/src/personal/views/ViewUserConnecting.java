package personal.views;

public class ViewUserConnecting extends Prompt{
    public String runFirst(){
        DbType type;
        while (true) {
            String typeDb = prompt("Введите тип БД (CSV or TXT): ");
            try {
                type = DbType.valueOf(typeDb.toUpperCase());
                switch (type) {
                    case CSV:
                        return "users.csv";
                    case TXT:
                        return "users.txt";
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            return "";
        }
    }
}


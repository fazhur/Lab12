package decorator;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Document document = new SmartDocument("gs://oop-course/Geico-2021.png");
        System.out.println(document.parse());
    }
}

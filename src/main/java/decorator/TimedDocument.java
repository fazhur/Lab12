package decorator;

import lombok.AllArgsConstructor;

import java.sql.SQLException;

@AllArgsConstructor
public class TimedDocument implements Document{

    private Document document;
    @Override
    public String parse() throws SQLException {
        long startTime = System.nanoTime();
        document.parse();
        return String.valueOf(System.nanoTime() - startTime);
    }
}
package decorator;

import java.sql.SQLException;

public interface Document {
    String parse() throws SQLException;
}

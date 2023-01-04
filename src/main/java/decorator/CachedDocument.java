package decorator;

import lombok.AllArgsConstructor;
import java.sql.SQLException;


public class CachedDocument implements Document{
    private Document document;
    private DBConnection dbConnection;
    CachedDocument(Document document, DBConnection dbConnection) throws SQLException {
        dbConnection = dbConnection.getInstance();
    }
    public CachedDocument(Document document){
        this.document = document;
    }
    @Override
    public String parse() throws SQLException {
        String responce = dbConnection.exists("path");
        if (!responce.equals(null)) {
            return responce;
        }
        else {
            String data = document.parse();
            dbConnection.getData("path", data);
            return data;
        }
    }
}

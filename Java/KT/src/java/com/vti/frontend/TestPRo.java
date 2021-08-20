package java.com.vti.frontend;

import java.com.vti.backend.Testback;
import java.sql.SQLException;

public class TestPRo {
    public static void main(String[] args) throws SQLException {
        Testback testback = new Testback();
        testback.databaseconnect();
        testback.q2();
    }
}

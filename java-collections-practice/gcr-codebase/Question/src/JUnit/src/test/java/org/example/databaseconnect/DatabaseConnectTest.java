package org.example.databaseconnect;

import org.example.database.DatabaseConnect;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseConnectTest {
    DatabaseConnect db;
    @BeforeEach
    public void connect(){
        db = new DatabaseConnect();
        db.connect();
    }

    @AfterEach
    public void disconnect(){
        db.disconnect();
    }
    @Test
    void testConnectionEstablished() {
        assertTrue(db.isConnected(), "Database should be connected before each test");
    }

    @Test
    void testConnectionClosed() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected");
    }
}

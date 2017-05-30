package edu.acc.j2ee.hubbub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HubbubDao implements Dao {
    private final Connection conn;
    
    public HubbubDao(String jdbcUrl, String jdbcUser, String jdbcPass)
            throws SQLException {
        conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPass);
    }

    @Override
    public boolean addUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addPost(Post p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findUserByUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

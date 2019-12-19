package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {

        DbManager dbManager = DbManager.getInstance();
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(4, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, count(*) as POSTS_NUMBER\n" +
                            "FROM USERS U join POSTS P ON U.ID = P.USER_ID\n" +
                            "GROUP BY P.USER_ID\n" +
                            "HAVING COUNT(*) >= 2;";

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + " " +
                                rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2, counter);
    }
}

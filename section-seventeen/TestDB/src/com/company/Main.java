package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:home/Desktop/java-course/section-seventeen/TestDB/test.db ");
        } catch (SQLException e) {
            System.out.println("Something screwed up " + e.getMessage());
        }
    }
}

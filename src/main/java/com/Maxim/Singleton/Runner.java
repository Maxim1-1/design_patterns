package com.Maxim.Singleton;

public class Runner {
    public static void main(String[] args) {
        DatabaseConnectionSingleton databaseConnection = new DatabaseConnectionSingleton();
        DatabaseConnectionSingleton databaseConnection1 = new DatabaseConnectionSingleton();
        DatabaseConnectionSingleton databaseConnection2 = new DatabaseConnectionSingleton();
        DatabaseConnectionSingleton databaseConnection3 = new DatabaseConnectionSingleton();


        databaseConnection.getInstance();
        databaseConnection.connect();

        databaseConnection1.getInstance();
        databaseConnection1.connect();

        databaseConnection2.getInstance();
        databaseConnection2.connect();

        databaseConnection3.getInstance();
        databaseConnection3.connect();
    }
}

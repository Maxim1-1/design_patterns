package com.Maxim.Singleton;

public class DatabaseConnectionSingleton {
    private static DatabaseConnectionSingleton instance;
    protected DatabaseConnectionSingleton() {}
    public static synchronized DatabaseConnectionSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionSingleton();
        }
        return instance;
    }

    public void connect() {
        System.out.print(String.format("Подключение к бд для объекта %s\n",instance));
    }
}
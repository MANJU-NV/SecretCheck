package org.example;

import io.github.cdimascio.dotenv.Dotenv;

public class SecureEnvExample {
    public static void main(String[] args) {
        // Load environment variables from .env file
        Dotenv dotenv = Dotenv.load();

        // Get the password
        String dbPassword = dotenv.get("DB_PASSWORD");

        System.out.println("Database Password: " + (dbPassword != null ? "Loaded successfully" : "Not set!"));
    }
}


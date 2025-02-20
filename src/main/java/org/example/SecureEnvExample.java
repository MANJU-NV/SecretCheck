package org.example;

import io.github.cdimascio.dotenv.Dotenv;

public class SecureEnvExample {
    public static void main(String[] args) {
        // Load environment variables from .env file
        String dbUser = System.getenv("DB_USERNAME");
        String dbPassword = System.getenv("DB_PASSWORD");
        String jwtSecret = System.getenv("JWT_SECRET");

        // Ensure secrets are not null
        if (dbUser == null || dbPassword == null || jwtSecret == null) {
            System.err.println("ERROR: Missing environment variables!");
            return;
        }

        // Use the secrets (Do NOT print sensitive info in production!)
        System.out.println("Database User: " + dbUser);
        System.out.println("JWT Secret Loaded Successfully");    }
}


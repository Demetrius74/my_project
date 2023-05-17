package org.example;

import org.example.dto.UserDto;
import org.example.rest.client.UserApiClient;

import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static final String BASE_URL = "https://gorest.co.in/public/v2/";
    public static void main(String[] args) {
        UserApiClient apiClient = new UserApiClient(BASE_URL);
        String message = "Enter action:\n 1 load users\n2 create user\n";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        switch (action){
            case  "1":
                List<UserDto> allUsers = apiClient.get();
                allUsers.forEach(System.out::println);
                break;
            case "2":
                //
            default:
                System.err.println("incorrect action");
        }
    }
}
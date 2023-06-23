/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author mihir
 */
    
 import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Choose your favorite genre: ");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Fantasy");
        
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        String genre;
        switch (choice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Fantasy";
                break;
            default:
                genre = "Unknown";
                break;
        }
        
        System.out.println("Your user profile was created!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
    
}

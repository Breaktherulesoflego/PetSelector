// Cooper Hawkins
//This is going to ask you a bunch of qustions and will tell you what pet you should get based on your answers

import java.util.Scanner;

public class pet {
    public static void main(String[] args) {
        // Code goes here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite color (Either red, blue, or green)!");
        String color = scanner.nextLine().toLowerCase();
        System.out.println("Enter your favorite season (Either spring, summer, fall, winter)!");
        String season = scanner.nextLine().toLowerCase();
        System.out.println("Enter your name");
        String name = scanner.nextLine().toLowerCase();

        if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1)) == -1) {
            System.out.println("Thats not a real name!!");
            return;
        } else if (color.equals("blue") && season.equals("fall")) {
            System.out.println("Your pet is an alligator ");
        } else if (color.equals("blue") && season.equals("spring")) {
            System.out.println("Your pet is an ostrich");
        } else if (color.equals("green") && season.equals("winter")
                && "bcdfghjklmnpqrstvwxyz".indexOf(name.charAt(0)) != -1) {
            System.out.println("Your pet is an giraffe");
        } else if (color.equals("green") && !season.equals("fall")) {
            System.out.println("Your pet is an dog");
        } else if (color.equals("red")) {
            System.out.println("Your pet is an panda");
        } else if ("aeiou".indexOf(name.charAt(0)) != -1) {
            System.out.println("Your pet is an porcupine");
        } else if (season.equals("summer")) {
            System.out.println("Your pet is ponies");
        } else if ("bcdfghjklmnpqrstvwxyz".indexOf(name.charAt(0)) != -1 && color.equals("blue")
                && !season.equals("summer") && !season.equals("fall")) {
            System.out.println("Your pet is an azolotl");
        }
        else{
            System.out.println("Your pet is a rock :(");
        }

    }

}
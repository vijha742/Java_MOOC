import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file_name = scanner.nextLine();
        Manager Chef = new Manager(file_name);
        while(true) {
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");
            System.out.print("Enter command: ");
            String choice = scanner.nextLine();
            System.out.println("");
                if(choice.equals("list")) {
                    System.out.println("Recipes:");
                    Chef.printRecipes();
                } else if(choice.equals("find name")) {
                    System.out.print("Searched word:");
                    String finder = scanner.next();
                    Chef.find(finder);
                } else if(choice.equals("find cooking time")) {
                    System.out.print("Max cooking time: ");
                    int max = Integer.valueOf(scanner.next());
                    Chef.maxTime(max);
                } else if(choice.equals("find ingredient")) {
                    System.out.print("Ingredient: ");
                    String material = scanner.nextLine();
                    System.out.println(material);
                    Chef.item(material);
            } else if(choice.equals("stop")) {
                break;
            } else {
                    System.out.println("Enter correct input");
            }
        }
    }

}

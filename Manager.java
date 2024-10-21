import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikas
 */
public class Manager {
    private ArrayList<Recipe> container;
    private String path;
    
    public Manager(String val) {
        this.container = new ArrayList<>();
        this.path = val;
        try(Scanner read = new Scanner(Paths.get(this.path))) {
            ArrayList<String> raw = new ArrayList<>();
            String material = null;
            String item = null;
            int time = 0;
            while(read.hasNextLine()) {
                item = read.nextLine();
                raw.clear();
                time = Integer.valueOf(read.nextLine());
                while(true) {
                    if((!read.hasNextLine())) {
                        System.out.println(raw);
                        container.add(new Recipe(item,time,raw));
                        break;
                    } else {
                        material = read.nextLine();
                        if(material.isBlank()) {
                            System.out.println(raw);
                            container.add(new Recipe(item,time,raw));
                            break;
                        } else {
                        raw.add(material);
                        }
                    }
                }
            }
        }      catch (Exception ex) {
        }
}
    
    public void printRecipes() {
        for (Recipe recipe : container) {
            System.out.printf("%s, cooking time: %d\n",recipe.getItem(),recipe.getTime());
            System.out.println(recipe);
        }
    }
    
    public void find(String text) {
        for(Recipe recipe:container) {
            if((recipe.getItem()).contains(text)) {
                System.out.println("Recipes");
                System.out.printf("%s, cooking time: %d\n",recipe.getItem(),recipe.getTime());
            }
        }
    }
    
    public void maxTime(int time) {
        for(Recipe recipe:container) {
            if(recipe.getTime() > time) {
            } else {
                System.out.println("Recipes");
                System.out.printf("%s, cooking time: %d\n",recipe.getItem(),recipe.getTime());
            }
        }
    }
    
    public void item(String text) {
        for(Recipe recipe:container) {
            if(recipe.getRaw().contains(text)) {
                System.out.println("Recipes");
                System.out.printf("%s, cooking time: %d\n",recipe.getItem(),recipe.getTime());
            }
        }
    }
    
}

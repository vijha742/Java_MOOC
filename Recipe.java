
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikas
 */
public class Recipe {
    private String item;
    private int time;
    private ArrayList<String> material;
    
    public Recipe(String food, int cooktime, ArrayList<String> rawItems) {
        this.item = food;
        this.time = cooktime;
        this.material = rawItems;
    }

    public String getItem() {
        return item;
    }

    public int getTime() {
        return time;
    }
    
    public ArrayList<String> getRaw() {
        return material;
    }

    @Override
    public String toString() {
        return "Recipe{" + "item=" + item + ", time=" + time + ", material=" + material + '}';
    }

    
    
    
}

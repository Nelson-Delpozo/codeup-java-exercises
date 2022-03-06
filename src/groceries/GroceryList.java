package groceries;

import java.util.ArrayList;

public class GroceryList {

    ArrayList<GroceryItem> groceries;

    public GroceryList(ArrayList<GroceryItem> groceries) {
        this.groceries = groceries;
    }

    public ArrayList<GroceryItem> getGroceries() {
        return groceries;
    }

    public void setGroceries(ArrayList<GroceryItem> groceries) {
        this.groceries = groceries;
    }
}

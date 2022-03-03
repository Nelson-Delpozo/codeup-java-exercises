package groceries;

import java.util.ArrayList;

public class GroceryApp {


    public static void main(String[] args) {

        ArrayList<GroceryItem> groceries = new ArrayList<>();

        GroceryItem tofu = new GroceryItem("tofu", "proteins", 4);
//        System.out.println(tofu.item + " -- " + tofu.category + " -- " + tofu.quantity);
        GroceryItem beans = new GroceryItem("beans", "proteins", 2);
        GroceryItem broccoli = new GroceryItem("broccoli", "veggies", 2);
        GroceryItem soymilk = new GroceryItem("soymilk", "drinks", 1);
//        System.out.println("tofu.getCategory() = " + tofu.getCategory());

        groceries.add(tofu);
        groceries.add(beans);
        groceries.add(broccoli);
        groceries.add(soymilk);

        soymilk.setQuantity(10);

        System.out.println("Your grocery list: ");

        for (GroceryItem grocery : groceries) {
            System.out.println(grocery.getItem() + " -- " + grocery.getCategory() + " -- " + grocery.getQuantity());
        }




    }
}

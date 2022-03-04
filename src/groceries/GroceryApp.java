package groceries;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryApp {


    public static void main(String[] args) {

        ArrayList<GroceryItem> groceries = new ArrayList<>();
        Scanner groceryScanner = new Scanner(System.in);

        System.out.println("Would you like to create a grocery list?[y/N]: ");
        String startNewList = groceryScanner.nextLine();
//        System.out.println(startNewList);

        if(startNewList.equals("y")){
            System.out.println("Would you like to add an item?[y/N]");
            String addNewItem = groceryScanner.nextLine();

            if (addNewItem.equals("y")){
                System.out.print("What item?: ");
                String newItem = groceryScanner.nextLine();
                System.out.print("What's the category?: ");
                String newItemCategory = groceryScanner.nextLine();
                System.out.print("How many?: ");
                int newItemQuantity = groceryScanner.nextInt();

                System.out.printf("Would you like to add this item?: %s --> category: %s --> quantity: %s", newItem, newItemCategory, newItemQuantity);
                System.out.println();
            }

//            System.out.println(addNewItem);
        }else System.exit(0);

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

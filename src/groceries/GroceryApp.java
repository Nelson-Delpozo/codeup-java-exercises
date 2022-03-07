package groceries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GroceryApp {


    public static void main(String[] args) {

        ArrayList<GroceryItem> groceries = new ArrayList<>();
        Scanner groceryScanner = new Scanner(System.in);
        groceryScanner.useDelimiter(System.lineSeparator());

        System.out.print("Would you like to create a grocery list?[y/N]: ");
        String startNewList = groceryScanner.nextLine();


        if (startNewList.equals("y")) {
            System.out.print("Would you like to add an item?[y/N]: ");
            String addNewItem = groceryScanner.nextLine();

            if (addNewItem.equals("y")) {
                boolean done = false;
                do {
                    System.out.print("What item?: ");
                    String newItem = groceryScanner.next();
                    System.out.print("What's the category?: ");
                    String newItemCategory = groceryScanner.next();
                    System.out.print("How many?: ");
                    int newItemQuantity = groceryScanner.nextInt();

                    System.out.printf("Would you like to add this item: %s --> category: %s --> quantity: %s [y/N]? ", newItem, newItemCategory, newItemQuantity);
                    Scanner itemAdder = new Scanner(System.in);
                    String addItem = itemAdder.nextLine();

                    if (addItem.equals("y")) {
                        GroceryItem newItemToAdd = new GroceryItem(newItem, newItemCategory, newItemQuantity);
                        groceries.add(newItemToAdd);
                    }

                    System.out.print("Would you like to add another item[y/N]? ");
                    String addAnother = itemAdder.nextLine();
                    if (addAnother.equalsIgnoreCase("n")) {
                        done = true;
                    }
                } while (!done);

            } else System.exit(0);

        } else System.exit(0);


        groceries.add(new GroceryItem("quinoa", "grains", 1));
        groceries.add(new GroceryItem("veggie chips", "snacks", 2));
        groceries.add(new GroceryItem("salsa", "snacks", 1));
        groceries.add(new GroceryItem("spaghetti", "pasta", 1));
        groceries.add(new GroceryItem("red peppers", "veggies", 2));
        groceries.add(new GroceryItem("tofu", "vegan", 3));
        groceries.add(new GroceryItem("chick peas", "beans", 2));
        groceries.add(new GroceryItem("broccoli", "veggies", 2));
        groceries.add(new GroceryItem("soymilk", "drinks", 1));


        boolean chooseSort = false;
        do {
            System.out.print("How would you like to see your list? [1=alpha 2=category]: ");
            int sort = groceryScanner.nextInt();
            if (sort == 1) {
                groceries.sort(Comparator.comparing(GroceryItem::getItem));
                chooseSort = true;
            } else if (sort == 2) {
                groceries.sort(Comparator.comparing(GroceryItem::getCategory));
                chooseSort = true;
            }
        } while (!chooseSort);

        for (GroceryItem grocery : groceries) {
            System.out.println(grocery.getItem() + " -- " + grocery.getCategory() + " -- " + grocery.getQuantity());
        }


    }
//    END OF MAIN METHOD

}
//END OF CLASS
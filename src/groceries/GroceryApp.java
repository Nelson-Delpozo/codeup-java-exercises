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


        if(startNewList.equals("y")){
            System.out.print("Would you like to add an item?[y/N]: ");
            String addNewItem = groceryScanner.nextLine();

            if (addNewItem.equals("y")){
                boolean done = false;
                do{
                System.out.print("What item?: ");
                String newItem = groceryScanner.next();
                System.out.print("What's the category?: ");
                String newItemCategory = groceryScanner.next();
                System.out.print("How many?: ");
                int newItemQuantity = groceryScanner.nextInt();

                System.out.printf("Would you like to add this item: %s --> category: %s --> quantity: %s [y/N]? ", newItem, newItemCategory, newItemQuantity);
                Scanner itemAdder = new Scanner(System.in);
                String addItem = itemAdder.nextLine();

                if(addItem.equals("y")){
                    GroceryItem newItemToAdd = new GroceryItem(newItem, newItemCategory, newItemQuantity);
                    groceries.add(newItemToAdd);
                }else System.exit(0);

                System.out.print("Would you like to add another item[y/N]? ");
                String addAnother = itemAdder.nextLine();
                if(addAnother.equalsIgnoreCase("n")){
                    done = true;
                }
                }while(!done);

            }else System.exit(0);

        }else System.exit(0);

        GroceryItem tofu = new GroceryItem("tofu", "proteins", 4);
        GroceryItem beans = new GroceryItem("beans", "proteins", 2);
        GroceryItem broccoli = new GroceryItem("broccoli", "veggies", 2);
        GroceryItem soymilk = new GroceryItem("soymilk", "drinks", 1);


        groceries.add(tofu);
        groceries.add(beans);
        groceries.add(broccoli);
        groceries.add(soymilk);

        soymilk.setQuantity(10);


        System.out.println("Your grocery list: ");

        groceries.sort(Comparator.comparing(GroceryItem::getItem));

        for (GroceryItem grocery : groceries) {
            System.out.println(grocery.getItem() + " -- " + grocery.getCategory() + " -- " + grocery.getQuantity());
        }

    }



    }

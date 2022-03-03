package groceries;

public class GroceryItem {

    public String item;
    public String category;
    public int quantity;

    public GroceryItem(String item, String category, int quantity) {
        this.item = item;
        this.category = category;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

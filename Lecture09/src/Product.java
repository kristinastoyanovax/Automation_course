import java.util.Objects;

/*
Create a class named Product with attributes such as the product name,
price, category, stock quantity, and one attribute to indicate if the product is
on sale. Define a method to put the product on sale. Include another
method to calculate and return a discounted price if the product is on sale,
applying a 10% discount if the price is greater than $100. If the product is
not on sale, return the original price. Additionally, create a method that
prints the product’s name, category, and either the discounted price or the
original price, depending on whether the product is on sale.

Enhance the Product class to support sales management based on product categories.
Introduce a static attribute called categoryOnSale to track the current sale category.
When creating a product, check if its category matches the sale category and adjust its
sale status accordingly.
Additionally, when updating a product's category, verify if it should now be on sale or
no longer eligible for a discount based on the current sale category. Hint: create a method that
will update the product category.
If the sale category changes, ensure all existing products are updated to reflect the
new sale status—those in the sale category should receive a discount, while those no longer
in the sale category should return to their regular price.
 */
public class Product {
    String productName;
    float price;
    String category;
    int stockQuantity;
    boolean isOnSale;
    static String categoryOnSale;

    public void putOnSale() {
        this.isOnSale = true;
    }

    public void changeCategory(String updatedCategory) {
        category = updatedCategory;
        if (Objects.equals(updatedCategory, categoryOnSale)) {
            putOnSale();
        }
        else {
           isOnSale = false;
        }
    }

    public float getDiscountedPrice() {
        if(this.isOnSale && this.price > 100) {
            return (float) (price * 0.9);
            }
        return price;
    }

    @Override
    public String toString() {
        return "productName - " + productName +
                ", price - " + getDiscountedPrice() +
                ", category - " + category;
    }

    public Product(String productName, float price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        if(Objects.equals(category, categoryOnSale)) {
            putOnSale();
        }
    }
}

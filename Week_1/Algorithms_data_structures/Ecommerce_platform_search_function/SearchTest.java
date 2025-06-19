public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "iPhone 15", "Electronics"),
            new Product(102, "Samsung Galaxy", "Electronics"),
            new Product(103, "Dell Laptop", "Computers"),
            new Product(104, "Nike Shoes", "Footwear")
        };

        System.out.println("Linear Search Result:");
        Product result1 = SearchUtils.linearSearch(products, "Nike Shoes");
        if (result1 != null) {
            System.out.println("Found: " + result1.getProductName());
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nBinary Search Result:");
        Product result2 = SearchUtils.binarySearch(products, "Dell Laptop");
        if (result2 != null) {
            System.out.println("Found: " + result2.getProductName());
        } else {
            System.out.println("Product not found.");
        }
    }
}

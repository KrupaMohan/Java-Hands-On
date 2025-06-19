public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1,"Laptop","Electronics"),
                new Product(2,"Shirt","Fashion"),
                new Product(3,"Phone","Electronics"),
                new Product(4,"Shoes","Fashion"),
                new Product(5,"Book","Education")
        };
        String searchName = "Phone";
        System.out.println("Linear Search Result:");
        Product foundLinear = SearchUtil.linearSearch(products, searchName);
        System.out.println(foundLinear!=null?foundLinear:"Product not found");
        System.out.println("\n Binary Search Result:");
        Product foundBinary = SearchUtil.binarySearch(products, searchName);
        System.out.println(foundBinary!=null?foundBinary:"Product not found");
    }
}

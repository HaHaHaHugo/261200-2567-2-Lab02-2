public class Book {

    // Fields to store book details
    private final String title;
    private final String author;
    private double price;

    // No-argument constructor with default values
    public Book() {
        this.title = "Unknown title";
        this.author = "Unknown author";
        this.price = 0;
    }

    // Parameterized constructor to initialize all fields
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Method to update the price of the book
    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            System.out.println("Invalid price. Price cannot be negative.");
        } else {
            price = newPrice;
            System.out.println("Price updated successfully.");
        }
    }

    // Method to apply a discount to the book price
    public void applyDiscount(double discountPercentage) {
        // Validate discount percentage
        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount percentage. It must be greater than 0 and less than 100.");
        } else {
            // Calculate the new price after applying the discount
            double discountAmount = (discountPercentage / 100) * price;
            double newPrice;
            newPrice = price - discountAmount;
            price = newPrice;

            // Print confirmation message
            System.out.println("A discount of " + discountPercentage + "% has been applied.");
            System.out.println("New price: $" + price);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test 1: Create a book with default values
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        // Test 2: Create a book with specified details
        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 500);
        hp1Book.displayDetails();

        // Test 3: Apply a valid discount
        hp1Book.applyDiscount(25.0);
        hp1Book.displayDetails();

        // Test 4: Apply an invalid discount (negative value)
        hp1Book.applyDiscount(-20.0);

        // Test 5: Apply an invalid discount (value greater than 100)
        hp1Book.applyDiscount(150.0);

        // Test 6: Apply a valid discount (0.5%)
        hp1Book.applyDiscount(99);
        hp1Book.displayDetails();
    }
}

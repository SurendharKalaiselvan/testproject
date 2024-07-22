package chennai.surendhar;

class Tour {

    int amount; // Instance variable to store the initial amount

    // Constructor to initialize the amount
    Tour(int amount) {
        this.amount = amount; 
    }

    public static void main(String[] args) {   //Main method
        // Create a new Tour object with an initial amount of 10000
        Tour tourist = new Tour(10000); 
        
        // Call the shopping method
        tourist.shopping();
        
        // Call the eat method
        tourist.eat();
    }

    // Method to simulate eating
    void eat() {
        // Print the instance's amount before eating
        System.out.println("Before Eating " + this.amount);
        
        // Local variable amount to represent the cost of eating
        int amount = 500; 
        
        // Print the local amount variable
        System.out.println(amount); 
    }

    // Method to simulate shopping
    void shopping() {
        // Local variable amount to represent the cost of shopping
        int amount = 1000; 
        
        // Print the local amount variable
        System.out.println(amount);
        
        // Print the instance's amount before shopping
        System.out.println("Before Shopping " + this.amount);
        
        // Subtract the local amount from the instance's amount
        this.amount = this.amount - amount;
        
        // Print the instance's amount after shopping
        System.out.println("After Shopping " + this.amount);
    }
}

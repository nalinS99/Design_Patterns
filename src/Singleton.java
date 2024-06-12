// File: Singleton.java

// Singleton class definition
public class Singleton {
    // Static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {}

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        // Check if the instance is null (first time accessing)
        if (instance == null) {
            // Create a new instance if it's null
            instance = new Singleton();
        }
        // Return the single instance
        return instance;
    }

    // Example usage in a main method
    public static void main(String[] args) {
        // Obtain the singleton instance using getInstance() method
        Singleton s1 = Singleton.getInstance();
        // Obtain the singleton instance again
        Singleton s2 = Singleton.getInstance();

        // Check if s1 and s2 are referring to the same instance
        System.out.println(s1 == s2);  // Output: true
    }
}

public class CandO {
     // Instance variables (attributes)
     String name;
     int age;
 
     // Constructor to initialize the object
     public CandO(String name, int age) {
         this.name = name;
         this.age = age;
     }
 
     // Method to display information about the person
     public void displayInfo() {
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
     }
     public static void main(String args[]) {
        // Creating objects of the Person class
        CandO person1 = new CandO("John", 25);
        CandO person2 = new CandO("Alice", 30);

        // Calling the displayInfo method to show information about the persons
        System.out.println("Person 1 Information:");
        person1.displayInfo();

        System.out.println("\nPerson 2 Information:");
        person2.displayInfo();
}
}


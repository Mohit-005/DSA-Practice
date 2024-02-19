import java.util.Scanner; // Import the Scanner class for user input

class Node {
    // Declare instance variables
    String name;
    int marks;
    Node next;

    // Constructor
    Node(String name, int marks, Node next) {
        this.name = name;
        this.marks = marks;
        this.next = next;
    }
}

class Stack {
    Node top; // Declare instance variable

    Stack() {
        top = null; // Initialize the top variable
    }

    // Method to push a student onto the stack
    void push(String name, int marks) {
        top = new Node(name, marks, top); // Create a new node and update the top pointer
    }

    // Method to pop a student from the stack
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        top = top.next; // Update the top pointer
    }

    // Method to peek at the top student of the stack
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(top.name + " " + top.marks); // Print the data of the top node
    }

    // Method to display all students in the stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top; // Create a current node to iterate through the stack
        while (current != null) {
            System.out.println(current.name + " " + current.marks);
            current = current.next; // Move to the next node
        }
    }

    // Method to find the top three students in the stack
    void topThree() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        // Create an array to store the top three students
        String[] topThreeNames = new String[3];
        int[] topThreeMarks = new int[3];
        Node current = top; // Create a current node to iterate through the stack
        // Iterate through the stack to find the top three students
        while (current != null) {
            for (int i = 0; i < 3; i++) {
                // If the current student has higher marks than the student at index i in topThree
                if (topThreeNames[i] == null || current.marks > topThreeMarks[i]) {
                    // Shift the students in topThree to make room for the new student
                    for (int j = 2; j > i; j--) {
                        topThreeNames[j] = topThreeNames[j - 1];
                        topThreeMarks[j] = topThreeMarks[j - 1];
                    }
                    // Add the current student to topThree
                    topThreeNames[i] = current.name;
                    topThreeMarks[i] = current.marks;
                    break;
                }
            }
            current = current.next;
        }
        // Display the top three students
        System.out.println("Top 3 students:");
        for (int i = 0; i < 3; i++) {
            if (topThreeNames[i] != null)
                System.out.println(topThreeNames[i] + " " + topThreeMarks[i]);
        }
    }
}

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        Stack stack = new Stack(); // Create a new stack

        while (true) {
            System.out.println("1. Add a student to Stack");
            System.out.println("2. Remove a Student from the Stack");
            System.out.println("3. Display all students of Stack");
            System.out.println("4. Display the top 3 positions of students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student marks: ");
                    int marks = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    stack.push(name, marks);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    stack.topThree();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close(); // Close the scanner object
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}
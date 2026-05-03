import java.util.Scanner;

public class Challenge1 {

    private int size;
    private int top;
    private int[] stackArr;

    // Parameterized constructor
    Challenge1(int size) {
        this.size = size;
        this.top = -1;
        this.stackArr = new int[size];
    }

    // Push operation
    void push(int ele) throws StackOverFlowException {
        if (top == size - 1) {
            throw new StackOverFlowException();
        }
        stackArr[++top] = ele;
        System.out.println("Element pushed: " + ele);
    }

    // Pop operation
    int pop() throws StackUnderFlowException {
        if (top == -1) {
            throw new StackUnderFlowException();
        }
        int deletedElement = stackArr[top--];
        System.out.println("Element popped: " + deletedElement);
        return deletedElement;
    }

    // Method to perform operations
    public static void performOperation(int choice, Challenge1 stack, Scanner sc) {
        try {
            if (choice == 1) {
                System.out.print("Enter element to push: ");
                int ele = sc.nextInt();
                stack.push(ele);
            } else if (choice == 0) {
                stack.pop();
            } else {
                System.out.println("Invalid choice!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Stack Exception Handling Demo ===");
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Challenge1 stack = new Challenge1(size);

        System.out.print("Enter choice (1 -> push, 0 -> pop): ");
        int choice = sc.nextInt();

        performOperation(choice, stack, sc);

        sc.close();
    }
}

// Custom Exception for Stack Overflow
class StackOverFlowException extends Exception {
    public String toString() {
        return "Stack is full. Cannot add more elements.";
    }
}

// Custom Exception for Stack Underflow
class StackUnderFlowException extends Exception {
    public String toString() {
        return "Stack is empty. Cannot remove elements.";
    }
}
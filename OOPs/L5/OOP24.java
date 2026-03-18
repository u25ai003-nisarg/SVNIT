interface QueueImpl {
    void insert(int personId); // Add person to back
    void delete();             // Person at front leaves
    void display();            // Show the current line
}
class QueueDemo implements QueueImpl {
    private int[] queue = new int[10]; // Maximum size of 10
    private int size = 0;              // Current number of people

    @Override
    public void insert(int personId) {
        // Checking for Overflow
        if (size == 10) {
            System.out.println("OVERFLOW: The queue is full. Person " + personId + " cannot join.");
        } else {
            queue[size] = personId;
            size++;
            System.out.println("Person " + personId + " joined the back of the queue.");
        }
    }

    @Override
    public void delete() {
        // Checking for Underflow
        if (size == 0) {
            System.out.println("UNDERFLOW: The queue is empty. No one to buy a ticket.");
        } else {
            System.out.println("Person " + queue[0] + " bought a ticket and left.");
            
            // "All remaining people take one step forward"
            for (int i = 0; i < size - 1; i++) {
                queue[i] = queue[i + 1];
            }
            size--; // Update the count since one person left
        }
    }

    @Override
    public void display() {
        if (size == 0) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.print("Current Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print("[" + queue[i] + "] ");
            }
            System.out.println();
        }
    }
}

public class OOP24 {
    public static void main(String[] args) {
        QueueDemo busStand = new QueueDemo();

        // 1. Adding people
        busStand.insert(101);
        busStand.insert(102);
        busStand.insert(103);
        busStand.display();

        // 2. Someone buys a ticket
        busStand.delete();
        busStand.display();

        // 3. Demonstrating Overflow (Trying to add more than 10)
        System.out.println("\n--- Filling the queue to its limit ---");
        for (int i = 1; i <= 10; i++) {
            busStand.insert(200 + i);
        }
        
        // 4. Demonstrating Underflow
        System.out.println("\n--- Emptying the queue ---");
        // We create a new empty stand to show underflow quickly
        QueueDemo emptyStand = new QueueDemo();
        emptyStand.delete(); 
    }
}

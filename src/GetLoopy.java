public class GetLoopy {
    public static void main(String[] args) {
        // Task 1: count from 0 to 30 by 1
        System.out.println("Task 1: Count up by 1 from 0 to 30.");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Add a new line at the end
        System.out.println(); // Add an empty line for next task

        // Task 2: count from 30 to 0 by 1
        System.out.println("Task 2: Count down by 1 from 30 to 0.");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // Add a new line at the end
        System.out.println(); // Add an empty line for next task

        // Task 3: count from 0 to 18 by 3
        System.out.println("Task 3: Count up by 3 from 0 to 18.");
        for (int i = 0; i <= 18; i +=3) {
            System.out.print(i + " ");
        }
        System.out.println(); // Add a new line at the end
        System.out.println(); // Add an empty line for next task

        // Task 4: count from 10 to 0 by 2
        System.out.println("Task 4: Count down by 2 from 10 to 0.");
        for (int i = 10; i >= 0; i -=2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Add a new line at the end
        System.out.println(); // Add an empty line for next task

        // Task 5
        System.out.println("Task 5 Figure:");
        for (int i = 1; i <= 5; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Add a new line
        }
        System.out.println(); // Add an empty line for next task

        // Task 6
        System.out.println("Task 6 Figure:");
        for (int i = 5; i >= 1; i--) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Add a new line
        }
        System.out.println(); // Add an empty line for next task

        // Task 7
        System.out.println("Task 7 Figure:");
        for (int i = 1; i <= 5; i++) {
            // Inner loop
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Add a new line
        }
        System.out.println(); // Add an empty line for next task
    }
}


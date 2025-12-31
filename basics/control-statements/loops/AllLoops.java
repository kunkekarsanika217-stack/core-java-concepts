//Demonstrates all types of loops in Java
public class AllLoops{

    public static void main(String[] args) {

        // for loop
        System.out.println("For Loop");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        // while loop
         System.out.println("While Loop");
        int j = 1;
        while (j <= 3) {
            System.out.println(j);
            j++;
        }

        // do-while loop
         System.out.println("Do-while Loop");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 3);

        // enhanced for loop
         System.out.println("For-each Loop");
        int[] numbers = {10, 20, 30};
        for (int num : numbers) {
            System.out.println(num);
        }

        // nested loop
         System.out.println("Nested Loop");
        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 2; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // break and continue
         System.out.println("Break and continue within loop");
        for (int x = 1; x <= 5; x++) {
            if (x == 3) continue;
            if (x == 5) break;
            System.out.println(x);
        }
    }
}
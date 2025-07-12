public class loops {
    // we are go to learn the loop in java
    public static void main(String[] args) {
        // for loop
        // mean it repeat the task
        // for (initialisation; condition; updation){ do something }

        String name = "syedzahid";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        // avoid infinite loop and it can fill our memory full
        for (int counter = 0; counter < 100; counter++) {
            System.out.println("hello");
        }

        // while loop
        // it will run the task until the condition is true
        // while (condition){ do something }
        int i = 0;
        while (i < 10) {
            System.out.println("hello this make me happy");
            i++;
            int j = 0;
            while (i == 10) {
                System.out.println("this an plan to trick u to belive in yourself");
                j++;
                if (j == 10) {
                    break;

                }
                int f = 0;
                do {
                    System.out.println("this is a do while loop");
                    f++;
                    if (f == 10) {
                        break;
                    }
                } while (f < 10);

            }

        }

    }
}

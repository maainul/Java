package Java8NewFeaturesdurgasoft;

public class ReplaceWithLambda {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        });

        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}


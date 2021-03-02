package innerclass;
// https://www.geeksforgeeks.org/anonymous-inner-class-java/
public class _13_AnonymousInnerClassThatDefinesInsideMethodOrConstructorArguments
{
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Child thread in inside Constructor argument");
            }
        });
        thread.start();
        System.out.println("Main thread starts");
    }
}

package thisKeyWord;

class Book{
    Book(){
        System.out.println("Book Constructor call");
    }

    Book(int x){
        this();
        System.out.println("Argument constructor call");
    }

}


public class _3_To_Invoke_Current_Class_Constructor {
    public static void main(String[] args) {
        Book book = new Book(10);
    }
}

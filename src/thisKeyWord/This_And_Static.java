package thisKeyWord;

public class This_And_Static {

    static int i = 10;
    public void m1(){
        System.out.println(this.i);
    }

    This_And_Static(){
        System.out.println(this.i);
    }




    public static void main(String[] args) {
        This_And_Static this_and_static = new This_And_Static();
        this_and_static.m1();
    }
}

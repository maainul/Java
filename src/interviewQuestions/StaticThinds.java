package interviewQuestions;


class Animal {
    public static void eat() {

    }

    public Number tet() {

        return 10;
    }


}

public class StaticThinds extends Animal {
    public static void eat() {
        System.out.println("next");

    }



    public Double tet(){
        return 20.00;
    }

    public static void main(String[] args) {
        Animal staticThinds = new StaticThinds();
        staticThinds.eat();
        System.out.println(staticThinds.tet());


    }

}

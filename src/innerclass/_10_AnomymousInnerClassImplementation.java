package innerclass;




public class _10_AnomymousInnerClassImplementation {
    public static void main(String[] args) {
        Age age = new Age() {
            @Override
            public void getAge() {
                System.out.println("Age is = "+x);
            }
        };
        age.getAge();
    }

}

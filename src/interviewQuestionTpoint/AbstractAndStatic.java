package interviewQuestionTpoint;

abstract class Test{
	int i = 10;
	static int j = 20;
}


public class AbstractAndStatic extends Test{
	public  static void  main(String[] args) {
		System.out.println("test");
		AbstractAndStatic abstractAndStatic = new AbstractAndStatic();
		System.out.println(abstractAndStatic.i);
		System.out.println(Test.j);
	}

}

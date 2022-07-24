package phase1.test2;

import phase1.test1.TestM;
import phase1.test1.TestP;
import phase1.test1.TestN;
public class TestZ extends TestN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestX().PublicMethod();
		new TestN().PublicMethod();
		new TestM().PublicMethod();
		
		new TestZ().ProtectedMethod();
		new TestP().MethodInP();
		System.out.println( "value of long in class TestX is "+new TestX().l);
		System.out.println( "value of float in class TestX is "+new TestX().f);
		System.out.println( "value of char in class TestX is "+new TestX().c);
	
	}

}

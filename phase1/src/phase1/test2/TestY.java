package phase1.test2;
import phase1.test1.TestN;
import phase1.test1.TestM;
public class TestY extends TestN {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new TestX().PublicMethod();
			new TestN().PublicMethod();
			new TestM().PublicMethod();
			
			new TestY().ProtectedMethod();
			System.out.println( "value of int in class TestN is "+ new TestN().k);
			System.out.println( "value of long in class TestX is "+new TestX().l);
			System.out.println( "value of float in class TestX is "+new TestX().f);
			System.out.println( "value of char in class TestX is "+new TestX().c);
		}

	}


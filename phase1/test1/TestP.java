package phase1.test1;

public class TestP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TestM().PublicMethod();
		new TestM().ProtectedMethod();
		new TestN().ProtectedMethod();
		new TestN().DefaultMethod();
		new TestP().MethodInP();
		

	}
	
	public void MethodInP(){
		System.out.println( "value of int in class TestN is "+ new TestN().k);
	}

}

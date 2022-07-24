package phase1.test1;

public class CallByValue {
	int val = 160;
	int operation(int val)
	{
		val=val*10/100;
		return val;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CallByValue d = new CallByValue();
		
		System.out.println("before:"+ d.val);
		int f= d.operation(100);
		System.out.println("after:"+ f);

	}

}

package phase1.test1;

public class Method {
	
	public int calculate(int a, int b)
	{	
		int c=a+b;
		return c;
	}
	public int calculate(int a)
	{	
		int m= (int)3.14*a*a;
		return m;
	}
	public int calculate(float c, float d)
	{	
		int m = (int) ((int)c*d);
		return m;
	}
	public int calculate(float d)
	{	
		int j= (int)((int)d*d);
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method C = new Method();
		int q=C.calculate(4,6);
		int w=C.calculate(2);
		int e=C.calculate(4f,6f);
		int r=C.calculate(2f);
		
		System.out.println("add:"+ q);
		System.out.println("circle:"+ w);
		System.out.println("rect:"+ e);
		System.out.println("sq:"+ r);
		

	}

}

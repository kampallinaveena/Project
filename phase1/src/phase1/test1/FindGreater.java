package phase1.test1;

public class FindGreater {
	int greater(int a, int b)
	{	int N;
		if(a>b)
			N=a;
		else 
			N=b;
		return N;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindGreater n = new FindGreater();
		int y = n.greater(20, 2);
		System.out.println("greater is:"+y);
		

	}

}

package phase1.test1;

public class AreaOfRect {
	
	int area(int a, int b)
	 {	
		int c= b*a; 
		return c;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRect a = new AreaOfRect();
		int Area = a.area(2, 10);
		System.out.println("area of rect:"+Area);


	}

}

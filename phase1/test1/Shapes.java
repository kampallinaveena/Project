package phase1.test1;

public class Shapes {
	
	int a;
	float b;
	double c,tr,rh;
	Shapes(){
		
	}
	Shapes(int s){
		a=(s*s);
	}
	Shapes(float l, float b){
		
		b=(l*b);
		
	}
	Shapes(double r){
		c=(3.14*r*r);
	}
	
	
	void displaySquare(){
		System.out.println("area of square is " +a);
	}
	void displayRect(){
		System.out.println("area of rectangle is " +b);
	}
	void displayCircle(){
		System.out.println("area of circle is " +c);
	}
	void area(float k, float l){
		tr=(0.5*k*l);
		System.out.println("area of triangle is " +tr);
	} 
	void area(double d1, double d2){
		rh=(0.5*d1*d2);
		System.out.println("area of rhombus is " +rh);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes s1=new Shapes(20);
		Shapes s2=new Shapes(2,5);
		Shapes s3=new Shapes(7.5);
		Shapes s4=new Shapes();
		Shapes s5=new Shapes();
		s1.displaySquare();
		s2.displayRect();
		s3.displayCircle();
		s4.area(20.2,10.5);
		s5.area(20,10);

	}

}

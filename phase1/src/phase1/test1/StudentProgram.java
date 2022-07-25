package phase1.test1;

public class StudentProgram {
	
	String name,n;
	int age,s1m=0,s2m,s3m,a;
	char section,s;
	char gender,g;
	float total;
	float percentage;
	
	StudentProgram(String name,int age,int s1m,int s2m, int s3m,char section,char gender){
		 total=(s1m+s2m+s3m);
		 percentage=(total/300)*100;
		 n=name;
		 a= age;
		 s=section;
		 g=gender;
		
	}
	StudentProgram(String name,int age,int s2m, int s3m,char section,char gender){
		 total=(s1m+s2m+s3m);
		 percentage=(total/300)*100;
		 n=name;
		 a= age;
		 s=section;
		 g=gender;
			}
		void display(){
			System.out.println("student name is " +n +" age:"+a+" section:"+s+" gender:"+g+" total:"+total+" percentage:"+percentage);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentProgram s1=new StudentProgram("ABC:",25,86,56,90,'B','M');
		s1.display();
		StudentProgram s2=new StudentProgram("PQR:",22,67,79,'A','M');
		s2.display();
		StudentProgram s3=new StudentProgram("XYZ:",23,78,72,'D','F');
		s3.display();
		StudentProgram s4=new StudentProgram("MNP:",24,87,90,69,'C','F');
		s4.display();
		

	}

}

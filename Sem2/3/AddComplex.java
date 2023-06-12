import java.util.Scanner;
class complex{

	float real;
	
	float imag;
	
	complex(float r,float i){
	
		real=r;
		
		imag=i;
	}
	
	complex(){
	
		real=0;
		
		imag=0;
	}
	
	void dispcomplex(){
		
		System.out.println(real+"+"+imag+"i");
	
	}
	
	void sum(complex c1,complex c2){
	
		real=c1.real+c2.real;
		
		imag=c1.imag+c2.imag;
		
	}
	
}

class AddComplex{

	public static void main(String a[]){
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("\nEnter the first complex no:");
	
	System.out.println("\nReal part:");
	
	float r1=s.nextFloat();
	
	System.out.println("\nImaginary part:");
	
	float i1=s.nextFloat();
	
	complex c1=new complex(r1,i1);
	
	System.out.println("\nEnter the second complex no:");
	
	System.out.println("\nReal part:");
	
	float r2=s.nextFloat();
	
	System.out.println("\nImaginary part:");
	
	float i2=s.nextFloat();
	
	complex c2=new complex(r2,i2);
	
	System.out.println("\nThe complex numbers are:");
	
	c1.dispcomplex();
	
	c2.dispcomplex();
	
	complex c3=new complex();
	
	c3.sum(c1,c2);
	
	System.out.println("\nSum:");
	
	c3.dispcomplex();
	
	}
	
}

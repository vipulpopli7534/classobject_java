package acadview;

public class Complex {
	int real,imaginary;
	Complex(int r,int i){
		real=r;
		imaginary=i;
	}
	void display(){
		if(imaginary<0)
			System.out.print(real+""+imaginary+"i");	
		else
		System.out.print(real+"+"+imaginary+"i");
	}
	
	
	
	public static void main(String [] args){
		Complex c;
		c=new Complex(5,-4);
		c.display();
	}

}

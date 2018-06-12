package acadview;


public class Rectangle_area {
		int length,breadth;
		Rectangle_area(){}
		Rectangle_area(int l,int b){
			length=l;
			breadth=b;
		}
		 public void CalculateArea(){
			int area=length*breadth;
			System.out.print("Area of rectangle is "+area);
		}
	
 public static void main(String[] args){
	 Rectangle_area r; 
	 r= new Rectangle_area(10,20);
	r.CalculateArea();
 }
}

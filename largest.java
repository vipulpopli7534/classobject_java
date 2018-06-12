package acadview;
import java.util.Scanner;
public class largest {
	
	
	
	public static void main(String[] args){
		int arr[];
		arr=new int[10];
		Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++){
		int n= sc.nextInt();
		arr[i]=n;
	}
	for(int i=0;i<arr.length-1;i++){
	 for(int j=0;j<arr.length-1-i;j++){
		 if(arr[j]>arr[j+1]){
			 int tmp=arr[j];
			 arr[j]=arr[j+1];
			 arr[j+1]=tmp;
		 }
	 }
	
	}
	 System.out.print(arr[8]);
}
}

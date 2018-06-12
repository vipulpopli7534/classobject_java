package acadview;

import java.util.Scanner;

public class Waveform {
	public static void main(String[] args){
	int arr[];
	arr=new int[10];
	Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++){
	int n= sc.nextInt();
	arr[i]=n;
}

for(int i=0;i<arr.length;i=i+2){
	int tmp=arr[i];
	arr[i]=arr[i+1];
	arr[i+1]=tmp;
}
for(int i=0;i<arr.length;i++){
	System.out.print(arr[i]+" ");
}


	}
}

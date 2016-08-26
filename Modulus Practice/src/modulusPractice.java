

import java.util.Scanner;
public class modulusPractice {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
//project 1
System.out.println("type a number");
if ((scan.nextInt())%2==1){
System.out.println("your number is odd");
	}
else{
	System.out.println("your number is even");
}
//project 2
System.out.println("type in a year");
if ((scan.nextInt())%4==0){
	System.out.println("your year is a leap year");
}
else {
	System.out.println("your year is not a leap year");
}
//project 3
int array[]={2,5,-7,1,3,12,19,-16,4,20};
for(int i =0;i<10;i++){
	if (i%3==2){
		System.out.println(array[i]);
	}
	
}
//project 4
for (int j=1;j<=100;j++){
	if (j%3==0&&j%5==0){
		System.out.println("fizzbuzz");
	}
	else if(j%3==0){
		System.out.println("fizz");
	}
	else if (j%5==0){
	System.out.println("buzz");
	}
	else {
		System.out.println(j);
	}
}

}
}

import java.util.Scanner;

public class DigitSum {

	int num;


	DigitSum(int num){	
	this.num = num;
	}

	void digitSum (int num) {
		int sum = 0;
		while(num!=0){
			int remainder = num % 10 ;
			sum += remainder;
			num = num / 10;
		}
		System.out.print(sum);
	}

	public static void main (String [] args){

	DigitSum ds = new DigitSum(123);
	ds.digitSum(123);
	}	
}
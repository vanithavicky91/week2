package week2.day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {22,3981,-19,82,0,45,37};
		Arrays.sort(num);

		System.out.println(" Minimum value is" +num[0]);
		System.out.println("Maximum value is" +num[num.length-1]);

	}

}

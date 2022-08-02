package week2.day2;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {50,60,70,60,80};
Arrays.sort(num);
for(int i=0;  i<num.length-1; i++)
{

if(num[i]==num[i+1]) {
	System.out.println(num[i]);
}
	
	}

	}
}

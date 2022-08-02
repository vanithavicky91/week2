package week2.day2;

public class Intersection {

	public static void main(String[] args) {
		// declare 2 arrays
		
int array1[]= {1,2,3,4,5};
int array2[]= {2,4,7,8,6};
int i=0;
int j=0;
while(i<array1.length&&j<array2.length) {
	if(array1[i]==array2[j]) {
		System.out.println(array1[i]);
		i++;
		j++;
	}else if(array1[i]>array2[j]) {
		j++;
	}else {i++;
	}
}



	}

}

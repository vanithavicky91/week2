package week2.day2;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String car="Volvo";
char[] ch=car.toCharArray();
int length=ch.length;
String revStr="";
for (int i = length-1; i >=0; i--) {
	revStr=revStr+ch[i];
}
	System.out.println(revStr);
}
	}




package week2.day2;

public class Oddindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="audi";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i%2!=0) {
				System.out.println(Character.toUpperCase(ch[i]));
				
			}else {
				System.out.println(ch[i]);
			}
		}
		}
		
}



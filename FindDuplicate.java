package week2.day2;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="How many duplicates are there?";
System.out.println(word);

String characters ="";
String duplicates ="";
for(int i=0;i<word.length();i++) {
	String current =Character.toString(word.charAt(i));
	if(characters.contains(current)){
		if(!duplicates.contains(current)) {
			duplicates  +=current + ",";
		}
		}
	
	characters +=current;
}
	System.out.println(duplicates);
}
			
	}


	



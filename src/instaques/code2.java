package instaques;

public class code2 {
	static int count=8;
	code2(){
		while(count < 10)
		new code2(++count);
	
	}
	 code2(int count) {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	new code2();
	new code2(count);
	System.out.println(count);
}
}

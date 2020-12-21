package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
	int a =95, b=81, c=190;
	int result = 0;
	if (a>b) {
		if(a>c) {
			result = a;
		}else {
			result = c;
		}
	}else {
		if (b>c) {
			result = b;
			}
		else {
			result = c;
		}
		
	}
	System.out.println("largest of three number is " + result);
		

	}
	// int a =95, b=81, c=190;
	// int result= 0;
	// result = a>b  ?  a>c ? a : c  :  b>c ? b : c;

}

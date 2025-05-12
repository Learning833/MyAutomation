package sampleProgram;

public class Reverse_String {

	public static void main(java.lang.String[] args) {
		String S = "MYPROGRAM";
		String reversed = new StringBuilder(S).reverse().toString();
		System.out.println("Reversed : "+reversed);
	}

}

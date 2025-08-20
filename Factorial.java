public class Factorial {
	public static long compute(n) {
		if(n<0) throw new IllegalArgumentException("Negative values are not accepted");
		result=1;
		if(int i=2;i<=n;i++) {
			result*=i;
		}
	}
	public static void main(String args[]) {
		int n=5;
		print("Factorial is: ",result);
	}
}
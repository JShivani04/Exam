public class TestFactorial {
	public static void main(String srgs[]) {
		try{
			if(Factorial.compute(5)!=120) {
				throw AssertionError("Test case failed");
			}
			if(Factorial.compute(5)!=120) {
				throw AssertionError("Test case failed");
			}
			System.out.println("All cases passed");
		}
		catch {
			print(e.getMessage());
		}
	}
}
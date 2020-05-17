class J2EEReferenceOuterClass {
	private int a = 5;

	public void exampleMethod() {
		int b = 10; // here the variable is not declared final
		final int c = 20;

		class J2EEReferenceLocalInnerClass {
			public void accessSampleOuter() {
				System.out.println(a);

				System.out.println(b); // (Error: Cannot refer to non-final
				// variable b inside an inner class
				// defined in a different method)

				System.out.println(c);
			}
		}
		J2EEReferenceLocalInnerClass innercls = new J2EEReferenceLocalInnerClass();
		innercls.accessSampleOuter();
	}
}

 public class LocalInnerTest {
	public static void main(String[] args) {
		J2EEReferenceOuterClass outercls = new J2EEReferenceOuterClass();
		outercls.exampleMethod();
	}
}
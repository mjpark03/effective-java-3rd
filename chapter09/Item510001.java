
public class StringConcatTest {

	public static void main(String[] args) {

		int count = 5000;

		String str1 = "";
		long startTime = System.nanoTime();
		for (int i = 0; i < count; i++) {
			str1 = str1 + "core";
		}
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println(" + operator: " + estimatedTime);

		String str2 = "";
		startTime = System.nanoTime();
		for (int i = 0; i < count; i++) {
			str2 = str2.concat("core");
		}
		estimatedTime = System.nanoTime() - startTime;
		System.out.println("concat method: " + estimatedTime);

		String str3 = "";
		StringBuilder sb = new StringBuilder();
		startTime = System.nanoTime();
		for (int i = 0; i < count; i++) {
			sb.append("core");
		}
		str3 = sb.toString();
		estimatedTime = System.nanoTime() - startTime;
		System.out.println("StringBuilder: " + estimatedTime);

		String str4 = "";
		StringBuffer sbuf = new StringBuffer();
		startTime = System.nanoTime();
		for (int i = 0; i < count; i++) {
			sbuf.append("core");
		}
		str4 = sbuf.toString();
		estimatedTime = System.nanoTime() - startTime;
		System.out.println("StringBuffuer: " + estimatedTime);
	}
  
}

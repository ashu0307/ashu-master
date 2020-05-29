package Excel;

public class StringSpace {

	public static void main(String[] args) {
		String value = "how  to  do  in  Java";
		String result = value.replaceAll("\\s+", " ");
		System.out.println("Data in the String is "+result);

	}

}

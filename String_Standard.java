package buoi3;

public class String_Standard {
	public static void main(String[] args) {
		String name = " le   vAn   luyEn   ";
//		name = name.trim();
//		name = name.replaceAll("\\s+", " ");
//		System.out.println(name);
		String string_standard = RemoveSpace(name);
//		System.out.println(name);
		String string_upcase = UpCaseFrist(string_standard);
		System.out.println(string_upcase);
		String lowercase = LowCase(string_upcase);
		System.out.println(lowercase);

	}

	public static String RemoveSpace(String str) {
		str = str.trim();
		while (str.indexOf("  ") != -1)
			str = str.replaceAll("  ", " ");
		System.out.println(str);
		return str;

	}

	public static String UpCaseFrist(String str) {
		String[] arr = str.split(" ");
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < arr.length; i++) {
			sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}

	public static String LowCase(String str) {
		str=str.toLowerCase();
		String[] arr = str.split(" ");
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < arr.length; i++) {
			sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}
}

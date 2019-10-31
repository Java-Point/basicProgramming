package removingSpace;

public class RemovingSpace {

	public static void main(String[] args) {
		String str = "My name is Rakesh Mahapatra";
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++)
			if (ch[i] != ' ' && ch[i] != '\t') {
				sb.append(ch[i]);
			}
		System.out.println(sb);
		sb = sb.reverse();
		System.out.println(sb);
	}

}

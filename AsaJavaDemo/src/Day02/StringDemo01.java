package Day02;

import java.util.Scanner;

public class StringDemo01 {
	/***/
	public static void main(String[] args) {
		/** ����������ʽ */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+";
		System.out.println(regex);
		String email = "sunleiu@qq.com";
		boolean bol = email.matches(regex);
		if (bol) {
			System.out.println("����Ч����");
		} else {
			System.out.println("������Ч����");
		}
	}
}

package Day02;

import java.util.Scanner;

public class StringDemo01 {
	/***/
	public static void main(String[] args) {
		/** 邮箱验证 */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+";
		System.out.println(regex);
		String email = "sunleiu@qq.com";
		boolean bol = email.matches(regex);
		if (bol) {
			System.out.println("是有效有效");
		} else {
			System.out.println("不是有效有效!");
		}
	}
}

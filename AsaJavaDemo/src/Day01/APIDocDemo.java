package Day01;
/**
 * ÎÄµµ×¢ÊÍ
 * 
 * @author asa
 *@version 1.0 2018-08-06
 */
public class APIDocDemo {
	public static void main(String[] args) {
		String aString="abc";
		String bString="abc";
		String cString=new String("abc");
		System.out.println(aString.equalsIgnoreCase(cString));
		System.out.println(aString.equals(bString));
		System.out.println(APIDocDemo.sayHellow()); 
	}
	/**ÎÊºÃ*/
   public static String sayHellow()
   {
	   return "hellow";
   }
}

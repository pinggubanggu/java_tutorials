package org.opentutorials.javatutorials.method;

public class MethodDemo3 {

	public static void numbering(int init, int limit) {
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(1, 5);

	} // 호출에서 입력한 값을 매개 한다는 의미에서 이러한 변수를 매개변수(parameter)
	  // 메소드를 호출할 떄 전달된 값인 5를 인자(argument)

}

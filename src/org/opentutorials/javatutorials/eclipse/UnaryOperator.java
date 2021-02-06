package org.opentutorials.javatutorials.eclipse;

public class UnaryOperator {

	public static void main(String[] args) {
	
		int i = 3;
		i++;
		System.out.println(i); // 4 출력
		++i;
		System.out.println(i); // 5 출력
		System.out.println(++i);// 6 출력
		//++을 시행하고 그 i값을 출력한다.
		System.out.println(i++); // 6 출력
		//i출력하고 ++을 시행해준다.
		System.out.println(i); // 7 출력
		
	}
}	
package org.opentutorials.javatutorials.method;

public class MethodDemo1 {

	public static void numbering() {
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		} // 메소드 정의
	}
	
	public static void main(String[] args) {
		numbering();
		
	} // 메소드 호출

}

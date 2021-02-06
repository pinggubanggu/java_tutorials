package org.opentutorials.javatutorials.eclipse;

public class For_eachDemo {

	public static void main(String[] args) {
		 String[] members = {"이동준","정영운","동운이"};
		 for (String e : members) {
			 System.out.println(e + "이 상담을 받았습니다");
		 } 
	} // for(String e : members)
	// 배열 members의 값을 변수 e에 담아서 중괄호 구간 안으로 전달해준다.

}

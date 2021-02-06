package org.opentutorials.javatutorials.eclipse;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		
		String[] members = {"이동준","정영운","동운이"};
		for (int i=0; i<members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다");
		} // 반복문과 배열의 조화

	}

}

package org.opentutorials.javatutorials.eclipse;

public class LoginDemo {

	public static void main(String[] args) {
		String id =args[0]; // 입력값
		if(id.equals("egoing")) { // equsals는 앞에 있는 값과 뒤에 있는 값을 비교하여 맞으면 ture, 아니면 false
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}

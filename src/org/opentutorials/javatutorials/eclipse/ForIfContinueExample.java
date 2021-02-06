package org.opentutorials.javatutorials.eclipse;

public class ForIfContinueExample {

	public static void main(String[] args) {
		for(int i =0; i<10; i++) {
			
			if(i == 5)
				continue;
			
			System.out.println("Coding Everybody" + i);
		}
		// 숫자5가 보이지 않는다. i의 값이 5가 되었을 떄 실행이 중단되었기 때문이다.
		// continue 구문은 이 명령이 나타나는 이후의 로직을 실행하지 않도록 한다.
		// 하지만 반복문 자체를 중단하는 것이 아니고 다시 반복문이 실행된다.

	}

}

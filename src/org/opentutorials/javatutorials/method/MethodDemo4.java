package org.opentutorials.javatutorials.method;

public class MethodDemo4 {

	public static String numbering(int init, int limit) {
		int i = init;
		String output ="";
		while(i < limit) {
			output += i;
			i++;
		}
		return output;
		//output에 담겨있는 문자열을 메소드 외부로 반환하려면 아래와 같이  return을 배치하면 된다.
		// return은 return 뒤에 따라오는 값을 메소드의 결과로 반환힌다.
		// 동시에 메소드를 종료시킨다.
		// 잊지 말아야 할 점은  return을 토 ㅇ해서 반환할 값의 데이터 형식을 메소드의이름 옆에 명시해주어야 한다.
	}
	
	
	
	
	public static void main(String[] args) {
		String result = numbering(4, 5);
		System.out.println(result);

	}

}

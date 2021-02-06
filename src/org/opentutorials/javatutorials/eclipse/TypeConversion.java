package org.opentutorials.javatutorials.eclipse;

public class TypeConversion {

	public static void main(String[] args) {
		//float a = 100.0;
		// 실수는 자동으로 double 데이터 타입을 가진다. 
		// float보다 double이 더 크기 때문에 자동 형변환이 일어나지 않는다.
		float c =(float)100.0; // 가능

		//int b = 100.0F;
		//실수가 더 커서 int 데이터 타입을 가진 b에 들어가지 않는다.
		int d = (int)100.0F;

	}

}

package org.opentutorials.javatutorials.method;

public class MethodDemo5 {

	public static String[] getMembers() {
		String[] members = {"이동준", " 정영운", "동운이"};
		return members;
	}
	
	public static void main(String[] args) {
		
		String[] members = getMembers();
		System.out.println(members);

	}

}

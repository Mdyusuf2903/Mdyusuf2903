package com.practice;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Yusuf";

		rev r = new rev();
		System.out.println(r.revString(str));

	}
}

class rev {
	String revString(String str) {

		StringBuilder sb = new StringBuilder();

		sb.append(str);

		sb.reverse();

		return sb.toString();
	}

}

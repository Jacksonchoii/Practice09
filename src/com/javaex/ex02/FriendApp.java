package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Friend> fList = new ArrayList<Friend>();

		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요.");

		Friend f01 = new Friend();
		Friend f02 = new Friend();
		Friend f03 = new Friend();

		fList.add(f01);
		fList.add(f02);
		fList.add(f03);

		for (int i = 0; i < fList.size(); i++) {
			String fri = sc.nextLine();
			String[] str = fri.split(" ");

			fList.get(i).setName(str[0]);
			fList.get(i).setHp(str[1]);
			fList.get(i).setSchool(str[2]);
		}

		for (Friend f : fList) {
			f.draw();
		}
	
		sc.close();
		
	}

}

package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Goods> gList = new ArrayList<Goods>();

		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("상품을 입력해주세요.(종료: q)");

		while (true) {
			String str = sc.nextLine();
			String[] sArr = str.split(",");

			if (str.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("=========================================");
				break;
			} else {
				gList.add(new Goods(sArr[0], Integer.parseInt(sArr[1]), Integer.parseInt(sArr[2])));
			}

		}
		sc.close();
		for (Goods g : gList) {
			g.showInfo();
			count += g.getCount();
		}
		System.out.println("모든 상품의 갯수는 " + count + "개입니다.");
		
	}

}

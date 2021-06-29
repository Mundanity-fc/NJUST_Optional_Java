package cn.jbit.loops1;

import java.util.Scanner;
public class PriceLookup {
	public static void main(String[] args){
		System.out.println("\nMyShopping管理系统 > 购物结算\n");
		System.out.println("*****************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t\t2.网球鞋\t\t3.网球拍");
		System.out.println("*****************************************");
		Scanner sc=new Scanner(System.in);
		String answer="y";
		String name="";
		double price=0.0;
		while("y".equals(answer)){
			System.out.print("请输入商品编号：");
			int goodsNo=sc.nextInt();
			switch(goodsNo){
			case 1:
				name="T恤";
				price=245.0;
				break;
			case 2:
				name="网球鞋";
				price=570.0;
				break;
			case 3:
				name="网球拍";
				price=320.0;
				break;
			}
			System.out.println(name+"\t￥"+price+'\n');
			System.out.print("是否继续(y/n)");
			answer=sc.next();
		}
		System.out.println("程序结束！");
	}
}

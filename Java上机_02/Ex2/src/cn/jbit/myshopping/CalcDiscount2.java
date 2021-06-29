package cn.jbit.myshopping;

import java.util.Scanner;
public class CalcDiscount2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入会员积分：");
		int custScore=sc.nextInt();
		double discount;
		if(custScore<2000) discount=0.9;
		else if(custScore<4000) discount=0.8;
		else if(custScore<8000) discount=0.7;
		else discount=0.6;
		System.out.println("该会员享受的折扣是："+discount);
	}
}

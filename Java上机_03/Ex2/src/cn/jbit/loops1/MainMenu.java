package cn.jbit.loops1;

import java.util.Scanner;
public class MainMenu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n欢迎使用MyShopping管理系统\n");
		System.out.println("**********************************");
		System.out.println("\t1.客 户 信 息 管 理");
		System.out.println("\t2.购 物 结 算");
		System.out.println("\t3.真 情 回 馈");
		System.out.println("\t4.注 销");
		System.out.println("**********************************\n");
		System.out.print("请选择，输入数字：");
		boolean isRight;
		int choice;
		do {
			isRight=true;
			choice=sc.nextInt();
			if(choice==1) System.out.println("执行客户信息管理");
			else if(choice==2) System.out.println("执行购物结算");
			else if(choice==3) System.out.println("执行真情回馈");
			else if(choice==4) System.out.println("执行注销");
			else {
				System.out.print("输入错误，请重新输入数字:");
				isRight=false;
			}
		}while(!isRight);
		System.out.println("\n 程序结束");
	}
}

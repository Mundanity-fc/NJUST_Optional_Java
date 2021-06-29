package cn.jbit.myshopping;

import java.util.Scanner;
public class AddCust {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("我行我素购物会员管理系统 > 客户信息系统 > 添加客户信息\n");
		System.out.print("请输入会员号(<4位整数>)：");
		int custNo=sc.nextInt();
		System.out.print("请输入会员生日(月/日<用两位数表示>):");
		String custBirth=sc.next();
		System.out.print("请输入积分：");
		int custScore=sc.nextInt();
		if(custNo>=1000&&custNo<=9999){
			System.out.println("\n已录入的会员信息是：\n"+custNo+'\t'+custBirth+'\t'+custScore);
		}else System.out.println("\n客户号"+custNo+"是无效会员号！\n录入信息失败！");
	}
}

package cn.jbit.loops1;

import java.util.Scanner;
public class PriceLookup {
	public static void main(String[] args){
		System.out.println("\nMyShopping����ϵͳ > �������\n");
		System.out.println("*****************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t\t2.����Ь\t\t3.������");
		System.out.println("*****************************************");
		Scanner sc=new Scanner(System.in);
		String answer="y";
		String name="";
		double price=0.0;
		while("y".equals(answer)){
			System.out.print("��������Ʒ��ţ�");
			int goodsNo=sc.nextInt();
			switch(goodsNo){
			case 1:
				name="T��";
				price=245.0;
				break;
			case 2:
				name="����Ь";
				price=570.0;
				break;
			case 3:
				name="������";
				price=320.0;
				break;
			}
			System.out.println(name+"\t��"+price+'\n');
			System.out.print("�Ƿ����(y/n)");
			answer=sc.next();
		}
		System.out.println("���������");
	}
}

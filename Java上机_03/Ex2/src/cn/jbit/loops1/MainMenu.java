package cn.jbit.loops1;

import java.util.Scanner;
public class MainMenu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n��ӭʹ��MyShopping����ϵͳ\n");
		System.out.println("**********************************");
		System.out.println("\t1.�� �� �� Ϣ �� ��");
		System.out.println("\t2.�� �� �� ��");
		System.out.println("\t3.�� �� �� ��");
		System.out.println("\t4.ע ��");
		System.out.println("**********************************\n");
		System.out.print("��ѡ���������֣�");
		boolean isRight;
		int choice;
		do {
			isRight=true;
			choice=sc.nextInt();
			if(choice==1) System.out.println("ִ�пͻ���Ϣ����");
			else if(choice==2) System.out.println("ִ�й������");
			else if(choice==3) System.out.println("ִ���������");
			else if(choice==4) System.out.println("ִ��ע��");
			else {
				System.out.print("���������������������:");
				isRight=false;
			}
		}while(!isRight);
		System.out.println("\n �������");
	}
}

package cn.jbit.loops2;

import java.util.Scanner;
public class LoginCheck {
	public static void main(String[] args) {
		int i=0;
		String userName;
		String password;
		Scanner input=new Scanner(System.in);
		for(;i<=2;i++) {
			System.out.print("�������û�����");
			userName=input.next();
			System.out.print("���������룺");
			password=input.next();
			if("jim".equals(userName) && "123456".equals(password)) {
				System.out.println("��ӭ��¼MyShoppingϵͳ��");
				break;
			}else {
				System.out.println("�������������"+(2-i)+"�λ��ᣡ\n");
				continue;
			}
		}
		if(i==3) {
			System.out.println("�Բ�����3�ξ��������");
		}
	}
}

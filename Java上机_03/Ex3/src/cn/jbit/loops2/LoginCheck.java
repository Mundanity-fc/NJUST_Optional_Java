package cn.jbit.loops2;

import java.util.Scanner;
public class LoginCheck {
	public static void main(String[] args) {
		int i=0;
		String userName;
		String password;
		Scanner input=new Scanner(System.in);
		for(;i<=2;i++) {
			System.out.print("请输入用户名：");
			userName=input.next();
			System.out.print("请输入密码：");
			password=input.next();
			if("jim".equals(userName) && "123456".equals(password)) {
				System.out.println("欢迎登录MyShopping系统！");
				break;
			}else {
				System.out.println("输入错误！您还有"+(2-i)+"次机会！\n");
				continue;
			}
		}
		if(i==3) {
			System.out.println("对不起，您3次均输入错误！");
		}
	}
}

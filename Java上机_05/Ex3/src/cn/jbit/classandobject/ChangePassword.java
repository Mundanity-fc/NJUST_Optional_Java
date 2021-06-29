package cn.jbit.classandobject;
import java.util.Scanner;
public class ChangePassword {
	public static void main(String[] args) {
		String nameInput;
		String pwd;
		String pwdConfirm;
		Scanner input = new Scanner(System.in);
		Administrator admin = new Administrator();
		admin.name="admin1";
		admin.password="111111";
		System.out.print("请输入用户名：");
		nameInput=input.next();
		System.out.print("请输入密码：");
		pwd=input.next();
		if(nameInput.equals(admin.name)&&pwd.equals(admin.password)) {
			System.out.print("\n请输入新密码:");
			pwd = input.next();
			System.out.print("请再次输入新密码:");
			pwdConfirm = input.next();
			while(!(pwd.equals(pwdConfirm))) {
				System.out.println("您两次输入的密码不一致，请重新输入！");
				System.out.print("\n请输入新密码:");
				pwd = input.next();
				System.out.print("请再次输入新密码:");
				pwdConfirm = input.next();
			}
			System.out.println("修改密码成功，您的新密码为："+pwd);
		}else System.out.print("用户名和密码不匹配！您没有权限更新管理员信息。");
	}
}

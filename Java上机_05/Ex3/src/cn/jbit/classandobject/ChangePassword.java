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
		System.out.print("�������û�����");
		nameInput=input.next();
		System.out.print("���������룺");
		pwd=input.next();
		if(nameInput.equals(admin.name)&&pwd.equals(admin.password)) {
			System.out.print("\n������������:");
			pwd = input.next();
			System.out.print("���ٴ�����������:");
			pwdConfirm = input.next();
			while(!(pwd.equals(pwdConfirm))) {
				System.out.println("��������������벻һ�£����������룡");
				System.out.print("\n������������:");
				pwd = input.next();
				System.out.print("���ٴ�����������:");
				pwdConfirm = input.next();
			}
			System.out.println("�޸�����ɹ�������������Ϊ��"+pwd);
		}else System.out.print("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
	}
}

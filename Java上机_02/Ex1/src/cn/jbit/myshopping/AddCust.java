package cn.jbit.myshopping;

import java.util.Scanner;
public class AddCust {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ع����Ա����ϵͳ > �ͻ���Ϣϵͳ > ��ӿͻ���Ϣ\n");
		System.out.print("�������Ա��(<4λ����>)��");
		int custNo=sc.nextInt();
		System.out.print("�������Ա����(��/��<����λ����ʾ>):");
		String custBirth=sc.next();
		System.out.print("��������֣�");
		int custScore=sc.nextInt();
		if(custNo>=1000&&custNo<=9999){
			System.out.println("\n��¼��Ļ�Ա��Ϣ�ǣ�\n"+custNo+'\t'+custBirth+'\t'+custScore);
		}else System.out.println("\n�ͻ���"+custNo+"����Ч��Ա�ţ�\n¼����Ϣʧ�ܣ�");
	}
}

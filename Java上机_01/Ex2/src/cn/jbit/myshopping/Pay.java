package cn.jbit.myshopping;

public class Pay {
	public static void main(String[] args){
		int shirtPrice=245;
		int shoePrice=570;
		int padPrice=320;
		int shirtNo=2;
		int shoeNo=1;
		int padNo=1;
		double discount=0.8;
		double finalPay=discount*(shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo);
		double returnMoney=1500-finalPay;
		int score=(int)finalPay*3/100;
		System.out.println("��������������*���ѵ�*��������������");
		System.out.println("������Ʒ\t"+"����\t"+"����\t"+"���\t");
		System.out.println("T��\t"+"��"+shirtPrice+"\t"+shirtNo+"\t"+"��"+(shirtPrice*shirtNo)+"\t");
		System.out.println("����Ь\t"+"��"+shoePrice+"\t"+shoeNo+"\t"+"��"+(shoePrice*shoeNo)+"\t");
		System.out.println("������\t"+"��"+padPrice+"\t"+padNo+"\t"+"��"+(padPrice*padNo)+"\t\n");
		System.out.println("�ۿۣ�\t8��");
		System.out.println("�����ܽ��\t��"+finalPay);
		System.out.println("ʵ�ʽ���\t��1500");
		System.out.println("��Ǯ\t��"+returnMoney);
		System.out.println("���ι����õĻ����ǣ�"+score);
	}
}

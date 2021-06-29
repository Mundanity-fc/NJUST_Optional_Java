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
		System.out.println("消费总金额："+finalPay);
	}
}

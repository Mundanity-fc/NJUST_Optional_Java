package cn.jbit.array;
import java.util.Scanner;
public class MinPrice {
	public static void main(String[] args) {
		int[] prices= new int[4];
		System.out.println("������4�ҵ�ļ۸�");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("��"+(i+1)+"��ļ۸�");
			prices[i]=input.nextInt();
		}
		int min=prices[0];
		for(int i=1;i<prices.length;i++)
			if(prices[i]<min) min=prices[i];
		System.out.println("��ͼ۸��ǣ�"+min);
	}
}

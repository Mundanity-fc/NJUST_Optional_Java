package cn.jbit.array;
import java.util.Arrays;
public class CharsSort {
	public static void main(String[] args) {
		char[] chars= {'a','c','u','b','e','p','f','z'};
		System.out.print("原字符排列：");
		for(int i=0;i<chars.length;i++)
			System.out.print(chars[i]+" ");
		Arrays.sort(chars,0,chars.length-1);
		System.out.print("\n升序排列后：");
		for(int i=0;i<chars.length;i++)
			System.out.print(chars[i]+" ");
		System.out.print("\n逆序输出为：");
		for(int i=chars.length-1;i>=0;i--)
			System.out.print(chars[i]+" ");
	}
}

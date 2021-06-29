package cn.jbit.classandobject;

public class AdministratorTest {
	public static void main(String[] args) {
		Administrator admin1 = new Administrator();
		Administrator admin2 = new Administrator();
		admin1.name="admin1";
		admin1.password="111111";
		admin1.show();
		admin2.name="admin2";
		admin2.password="222222";
		admin2.show();
	}
}

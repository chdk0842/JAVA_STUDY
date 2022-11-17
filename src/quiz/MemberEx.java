package quiz;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member user1 = new Member("hong","12345");
		
		user1.login();
		
		System.out.println("========================");
		
		user1.logout(user1.id);
		
	}

}

package polymorphism2;

public class majinBoo {

	public static void main(String[] args) {

		EnemyOfAbility eoa = new Night("百烈剣");
		eoa.useAbility();

		eoa = new arrow("百烈矢");
		eoa.useAbility();
	}

}
package polymorphism2;

public class Night extends EnemyOfAbility{

	public Night(String attackName){
		super.attackName = attackName;
	}

	@Override
	protected void useAbility() {
		System.out.println("ナイトから吸収した必殺技" + super.attackName);
	}

}

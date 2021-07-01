package polymorphism2;

public class arrow extends EnemyOfAbility{
	public arrow(String attackName){
		super.attackName = attackName;
	}

	@Override
	protected void useAbility() {
		System.out.println("弓矢兵から吸収した必殺攻撃" + super.attackName);
	}

}

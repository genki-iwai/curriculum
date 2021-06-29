package polymorphism;

//抽象クラス: コピー対象の能力
public abstract class AbilityOfEnemy {

	//敵の攻撃名
	protected String attackName;

	//抽象メソッド: コピーした敵の能力を使う
	protected abstract void useAbility();

}

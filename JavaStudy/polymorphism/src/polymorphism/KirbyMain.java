package polymorphism;

public class KirbyMain {

	public static void main(String[] args) {
		//まずはプラズマを吸い込む
		AbilityOfEnemy aoe = new PlasmaWisp("プラズマ波動弾");
		//打つべし
		aoe.useAbility();
		//続いてナイトを吸い込む
		aoe = new BradeKnight("百烈ぎり");
		//切るべし
		aoe.useAbility();
	}

}

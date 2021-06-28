package interfaces;

/**
 * @author user
 * 1.インターフェース: 上長（もときさん）の司令
 * <pre>public interface インターフェース名 {}<pre>
 *
 */
public interface OrderFromMotoki {
	/* ----インターフェースメソッド {} の処理は何も書かない！ ----*/
	//司令（月末までに勤務表出せや！
	public void daseyaKinmuhyo();
	//司令（できれば月末までに交通費出せや！
	public void daseyaKotsuhi();
	//お邪魔虫な司令
	//(例)セブンイレブン行けや！
	//（こじつけてしまえば何でもありですが、必ずこなす業務的な司令としては、なんか適してないよねって話）
	public void goToSevenEleven();

}

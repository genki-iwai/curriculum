package interfaces;

public class Nanami implements OrderFromMotoki , OrderFromShihandai {

	private String name;
	private String date;

	public Nanami(String n , String yyyyMM){
		name = n;
		date = yyyyMM;
	}
	//司令をこなす！
	private void submitOrder(final int shoriFlg){
		String nameAnd = name + "、";

		if(shoriFlg == 0){
			//勤務表
			System.out.println(nameAnd + date + "の勤務表を出しました。");
		}else if(shoriFlg == 1){
			System.out.println(nameAnd + date + "の交通費も出しました。");
		}else {
			//その他
			System.out.println(nameAnd + "本当はまだ何もしていません");
		}
	}
	//言いづらいけど、何もしていません
	public void doNothing(){
		submitOrder(-1);
	}

	@Override
	public void daseyaKinmuhyo() {
		submitOrder(0);
	}

	@Override
	public void daseyaKotsuhi() {
		submitOrder(1);
	}

	@Override
	public void goToSevenEleven() {
		System.out.println("先にセブンイレブンに行ってきます");
	}
	@Override
	//Javaカリキュラムを作れ
	public String doCreateJavaCurriculum() {
		return "Javaカリキュラム完成しました";
	}

}

package interfaces;

public class NanamiMain {

	public static void main(String[] args) {
		//3.実現(1,2を使ってみる)
		Nanami nanami = new Nanami("七海" , "2021/06");
		nanami.daseyaKinmuhyo();
		nanami.daseyaKotsuhi();
		nanami.doNothing();
		nanami.goToSevenEleven();

		//Javaカリキュラムを作って報告
		final String message = nanami.doCreateJavaCurriculum();
		System.out.println("message = " + message);

	}

}

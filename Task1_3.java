/**
 * Task1-3 : 課題内容
 *
 * 本課題では、演算子の使い方を学んでいきましょう。
 * 問①から問⑦まであります。
 * 指定された数値、式、変数名を守って記述してください。
 *
 * 問③,⑤については、コメントを入れてください。
 * 問⑦については、変数名を使って出力してください。
 *
 */
public class Task1_3 {

    public static void main(String[] args) {

        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
        int plus=0;
            plus=5 + 10;


        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
        int minus=0;
            minus=20 - 7;

        // ③下記の処理について、何をしているのかコメントを記入してください。
        // [ここへ記述]10と2を乗算した値をint型の変数[multiply]に代入している。
        int multiply=10 * 2;

        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
        int remi=0;
            remi=20 % 6;

        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // [ここへ記述]String型の変数[town]に"有楽町"[line]に"線"をそれぞれ代入している。
        String town = "有楽町";
        String line = "線";

        // ⑥ ⑤で作成cdした変数を連結させた値を代入する変数 train を作成しなさい。
        String train = town + line;
        

        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(remi);
        System.out.println(train);
    }
}
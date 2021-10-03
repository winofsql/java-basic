public class HelloBasic2 {

    public static void main(String[] args) {

        // 5つのデータを格納可能な配列を作成する
        int[] data = new int[5];

        // 一つ目
        data[0] = 10;
        System.out.println(data[0]);

        // 二つ目
        data[4] = 40;
        System.out.println(data[4]);

        // 配列の長さ
        System.out.println(data.length);

        // 配列り初期化( 初期化の値の数が格納可能な配列を作成する )
        int[] data2 = { 1, 2, 3 };
        System.out.println(data2.length);

        // 拡張 for ( いわゆる foreach )
        for (var item : data2) {
            System.out.println(item);
        }

    }

}
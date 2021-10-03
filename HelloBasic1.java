public class HelloBasic1 {

    public static void main(String[] args) {

        int a = 16;
        System.out.println(a);

        // 整数を 16進数 で表現
        int b = 0x01;

        // 10進数では 16
        b = 0x10;
        System.out.println(b);
        b = 0x11;
        System.out.println(b);
        b = 0x19;
        System.out.println(b);
        b = 0x1a;
        System.out.println(b);
        b = 0x1f;
        System.out.println(b);
        // 10進数では 32
        b = 0x20;
        System.out.println(b);

        // 型推論( Double )
        var num = 3.14;
        System.out.println(((Object) num).getClass().getSimpleName());

        // 型推論( Integer )
        var yen = 1;
        System.out.println(((Object) yen).getClass().getSimpleName());

        // 型推論( String )
        var name = "日本語";
        System.out.println(name.getClass().getSimpleName());

        // 文字列の比較( メソッド )
        if (name.equals("日本語")) {
            System.out.println("一致");
        }
        if (!name.equals("日本")) {
            System.out.println("一致しない");
        }
        // かつ( and ) / ∩
        if (name.equals("日本語") && yen == 1) {
            System.out.println("両方一致");
        }
        // A ∩ B の否定は !A ∪ !B
        if (!name.equals("日本語") || yen != 1) {
            System.out.println("両方一致");
        }
        // または( or ) / ∪
        if (name.equals("日本語") || yen == 2) {
            System.out.println("片方一致");
        }
        // A ∪ B の否定は !A ∩ !B
        if (!name.equals("日本語") && yen != 2) {
            System.out.println("両方一致");
        }
        if (name.equals("日本語")) {
            if (yen == 1) {
                // A ∩ B
                System.out.println("両方一致");
            } else {
                // 処理
            }
        } else {
            // 処理
        }

        // 文字列の整数
        String su = "123";

        // 文字列を整数に変換
        int result = Integer.parseInt(su);
        result++;
        result += 2;
        result = result + 2;
        System.out.println(result);

        // 整数を文字列に変換
        String text = String.format("%d", result);
        System.out.println(text);

        // 簡易的な方法
        text = result + "";
        System.out.println(text);

    }

}
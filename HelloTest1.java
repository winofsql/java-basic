public class HelloTest1 {

    public static void main(String[] args) {

        int a;
        a = 16;

        int b = 0x01; // 16進数
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
        b = 0x20;
        System.out.println(b);

        var num = 3.14;
        System.out.println(((Object) num).getClass().getSimpleName());

        var yen = 1;
        System.out.println(((Object) yen).getClass().getSimpleName());

        var name = "日本語";
        System.out.println(name.getClass().getSimpleName());

        if (name.equals("日本語")) {
            System.out.println("一致");
        }
        if (!name.equals("日本")) {
            System.out.println("一致しない");
        }
        if (name.equals("日本語") && yen == 1) {
            System.out.println("両方一致");
        }
        if (name.equals("日本語") || yen == 2) {
            System.out.println("片方一致");
        }
        if (name.equals("日本語")) {
            if (yen == 1) {
                System.out.println("両方一致");
            } else {
                // 処理
            }
        } else {
            // 処理
        }

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
using System;

namespace basic
{
    class HelloBasic1
    {
        // basic.HelloBasic1._Main(new string[1]);
        public static void _Main(string[] args)
        {
            int a = 16;
            Console.WriteLine (a);

            // 整数を 16進数 で表現
            int b = 0x01;
            b = 0x10;
            Console.WriteLine (b);

            // java で言うところの型推論( System.Double )
            var num = 3.14;
            Console.WriteLine(num.GetType());

            // java で言うところの型推論( System.Int32 )
            var yen = 1;
            Console.WriteLine(yen.GetType());

            // java で言うところの型推論( System.String )
            var name = "日本語";
            Console.WriteLine(name.GetType());

            string name2 = "日本語";
            Console.WriteLine(name2.GetType());

            Console.WriteLine(name == "日本語");

            if (name == "日本語")
            {
                Console.WriteLine("一致します");
            }
            if (!(name == "日本"))
            {
                Console.WriteLine("一致しない");
            }

            // 文字列の整数
            string su = "123";

            // 文字列を整数に変換
            int result = int.Parse(su);
            result++;
            result += 2;
            result = result + 2;
            Console.WriteLine (result);

            // 整数を文字列に変換
            string text = string.Format("{0}", result);
            Console.WriteLine (text);

            result += 1;

            // 整数を文字列に変換
            text = $"{result}";
            Console.WriteLine (text);

            // 入力した文字列をそのまま利用( @ : 但し " は "" )
            text = $@"{result}
            <input type=""text""> c:\app\java21
";
            Console.WriteLine (text);

            // 簡易的な方法
            text = result + "";
            Console.WriteLine (text);
        }
    }
}

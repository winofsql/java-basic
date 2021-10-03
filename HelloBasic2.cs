using System;

namespace array
{
    class HelloBasic2
    {
        static void Main(string[] args)
        {
            // 5つのデータを格納可能な配列を作成する
            int[] data = new int[5];
            data[0] = 10;
            Console.WriteLine(data[0]);

            data[4] = 40;
            Console.WriteLine(data[4]);

            // 配列の長さ
            Console.WriteLine(data.Length);

            // 配列り初期化( 初期化の値の数が格納可能な配列を作成する )
            int[] data2 = { 1, 2, 3 };
            Console.WriteLine(data2.Length);

            // foreach
            foreach (var item in data2)
            {
                Console.WriteLine (item);
            }
        }
    }
}

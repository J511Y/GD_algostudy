using System;

namespace Baekjoons_2
{
    class _2주차_1차원배열_최소_최대_10818
    {
        static void Main(string[] args)
        {
            int[] ints = new int[int.Parse(Console.ReadLine())];
            string str = Console.ReadLine();
            string[] strs = str.Split(' ');

            for (int i = 0; i < ints.Length; i++)
            {
                ints[i] = Convert.ToInt32(strs[i]);
            }

            int max, min;
            max = ints[0];
            min = ints[0];

            for (int i = 0; i < ints.Length; i++)
            {
                if (ints[i] > max)
                    max = ints[i];
                if (ints[i] < min)
                    min = ints[i];
            }

            Console.WriteLine("{0} {1}", min, max);
        }
    }
}

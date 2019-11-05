using System;

namespace Baekjoons_2
{
    class _2주차_문자열_단어의개수_1152
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            if (string.IsNullOrEmpty(str.Trim()))
            {
                Console.WriteLine(0);
            }
            else
            {
                string[] strs = str.Trim().Split(' ');
                Console.WriteLine(strs.Length);
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baekjoons_2
{
    class _2주차_1차원배열_ox퀴즈_8958
    {
        static void Main(string[] args)
        {
            //// substring
            //// 입력부
            //string[] strs = new string[int.Parse(Console.ReadLine())];
            //for (int i = 0; i < strs.Length; i++)
            //    strs[i] = Console.ReadLine();
            ////

            //// 연산 및 출력
            //for (int i = 0; i < strs.Length; i++)
            //{
            //    int score = 0;
            //    int amount = 0;
            //    for (int j = 0; j < strs[i].Length; j++)
            //    {
            //        if (strs[i].Substring(j, 1) == "O")
            //            amount++;
            //        else
            //            amount = 0;
            //        score += amount;
            //    }
            //    Console.WriteLine(score);
            //}
            ////


            // char 배열
            // 입력부
            string[] strs = new string[int.Parse(Console.ReadLine())];
            for (int i = 0; i < strs.Length; i++)
                strs[i] = Console.ReadLine();
            //

            // 연산 및 출력
            for (int i = 0; i < strs.Length; i++)
            {
                int score = 0;
                int amount = 0;
                char[] chars = strs[i].ToCharArray();
                for (int j = 0; j < chars.Length; j++)
                {
                    if (chars[j] == 'O')
                        amount++;
                    else
                        amount = 0;
                    score += amount;
                }
                Console.WriteLine(score);
            }
            //

        }
    }
}

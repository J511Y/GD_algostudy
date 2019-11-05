using System;

namespace Baekjoons_2
{
    class _2주차_문자열_단어공부_1157
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine().ToUpper();
            char[] chars = str.ToCharArray();

            int[] strsCount = new int[26];
            for (int i = 0; i < chars.Length; i++)
            {
                strsCount[chars[i] - 'A'] += 1;
            }

            int max=0;
            int maxpos=0;
            for (int i = 0; i < strsCount.Length; i++)
            {
                if (max < strsCount[i])
                {
                    max = strsCount[i];
                    maxpos = i;
                }
            }
            strsCount[maxpos] = 0;

            foreach (int item in strsCount)
            {
                if(item == max)
                { // 같은 값이 있을 경우
                    Console.WriteLine("?");
                    goto EXIT_FOREACH; 
                }
            }
            Console.WriteLine(Convert.ToChar(maxpos + 'A')); // 같은 값이 엾을 경우
            EXIT_FOREACH:; 
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baekjoons
{
    class _1차원배열_평균은_넘겠지_4344
    {
        static void Main(string[] args)
        {
            //입력부
            int cases = int.Parse(Console.ReadLine());
            int[][] casesArray = new int[cases][];

            for (int i = 0; i < cases; i++)
            {
                string str = Console.ReadLine();
                string[] strs = str.Split(' ');
                int arraycount = int.Parse(strs[0]);
                casesArray[i] = new int[arraycount + 1 ];
                casesArray[i][0] = arraycount;
                for (int j = 1; j < casesArray[i].Length; j++)
                {
                    casesArray[i][j] = int.Parse(strs[j]);
                }
            }

            //출력부
            for (int i = 0; i < cases; i++)
            {
                int sum=0;
                double avg = 0;
                int count = 0;
                for (int j = 1; j < casesArray[i][0]; j++)
                {
                    sum += casesArray[i][j];
                }
                avg = sum / (casesArray[i][0] * 1.0);

                for (int j = 1; j < casesArray[i][0]; j++)
                {
                    if (avg < casesArray[i][j])
                        count++;
                }
                Console.WriteLine("{0}", count/(casesArray[i][0]* 1.0));
            }
        }
    }
}

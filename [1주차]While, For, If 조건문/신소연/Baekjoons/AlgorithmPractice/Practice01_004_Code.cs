using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AlgorithmPractice
{
    class Practice01_004_Code
    {
        static void Main(string[] args)
        {
            int max = 300000;
            int min = 100000;
            int i = max;
            //while (i ++ < max)
            //{
            //    numberAnalysis(i);
            //}
            int a, b =0;
            while (i-- > min)
            {
                a = numberAnalysis(i);
                if (a != b)
                {
                    b = a;
                    Console.WriteLine("{0} : {1}", i, b);
                }
            }
        }

        static int numberAnalysis(int number)
        {
            return (number - 998) / 999;
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baekjoons.temp
{
    class _1부터_100000까지_소수
    {
        static void Main(string[] args)
        {
            int count=1; // 2의 경우를 미리 더해줌
            for (int i = 2; i <= 500000; i++)
            {
                if (i % 2 == 0)
                    continue;
                for (int j = 2; j*j <= i; j++)
                {
                    if (i % j == 0) goto NOTPRIMARY;
                }
                count ++;
                NOTPRIMARY:;
            }

            Console.WriteLine(count);
        }
    }
}

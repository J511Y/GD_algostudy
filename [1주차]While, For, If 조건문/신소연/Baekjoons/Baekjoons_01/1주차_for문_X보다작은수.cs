using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baekjoons
{
    class for문_X보다작은수
    {
        static void Main(string[] args)
        {
            //입력부
            string str = Console.ReadLine();
            string[] strs = str.Split(' ');
            str = Console.ReadLine();
            string[] strs02 = str.Split(' ');
            
            // 값을 배열에 넣는 부분
            int[] ints01 = new int[2];
            for (int i = 0; i < ints01.Length; i++)
            {
                ints01[i] = Convert.ToInt32(strs[i]);
            }

            int[] ints02 = new int[ints01[0]];
            for (int i = 0; i < ints02.Length; i++)
            {
                ints02[i] = Convert.ToInt32(strs02[i]);
            }
            //

            //값 출력
            for (int i = 0; i < ints02.Length; i++)
            {
                if (ints02[i] < ints01[1])
                    Console.Write("{0} ", ints02[i]);
            }
        }
    }
}

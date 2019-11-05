using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baekjoons
{
    class while문_더하기사이클
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            int[] ints = new int[2];

            if (str.Length < 2)
            {
                ints[0] = 0;
                ints[1] = Convert.ToInt32(str.Substring(0, 1));
            }
            else
            {
                ints[0] = Convert.ToInt32(str.Substring(0, 1));
                ints[1] = Convert.ToInt32(str.Substring(1, 1));
            }

            int cnt = 0;
            int result=0;
            while (true)
            {
                result = ints[0] + ints[1];
                cnt++;
                ints[0] = ints[1];
                ints[1] = result % 10;
                if (string.Format("{0}",Convert.ToInt32(ints[0].ToString()+ints[1].ToString())) == str)
                    break;
            }
            Console.WriteLine(cnt.ToString());
        }
    }
}

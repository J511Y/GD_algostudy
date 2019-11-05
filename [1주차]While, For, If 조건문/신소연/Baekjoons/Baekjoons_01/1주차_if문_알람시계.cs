using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baekjoons
{
    class if문_알람시계
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            string[] strs = str.Split(' ');
            int[] ints = new int[2];
            int H = Convert.ToInt32(strs[0]);
            int M = Convert.ToInt32(strs[1]);

            DateTime datetime = new DateTime(2019, 9, 11, H, M, 0);
            datetime = datetime.AddMinutes(-45);

            Console.WriteLine("{0} {1}", datetime.Hour, datetime.Minute);
        }
    }
}

using System;

namespace Baekjoons_2
{
    class _2주차_문자열_크로아티아알파벳_2941
    {
        static void Main(string[] args)
        {
            string[] croa = new string []{"c=", "c-", "dz=", "d-","lj","nj","s=","z=" };
            string str = Console.ReadLine();
            for (int i = 0; i < croa.Length; i++)
            {
                str = str.Replace(croa[i], "a");
            }
            Console.WriteLine(str.Length);
        }
    }
}

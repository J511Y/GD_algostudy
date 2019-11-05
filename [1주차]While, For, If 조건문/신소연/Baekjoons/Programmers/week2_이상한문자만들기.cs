using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Programmers
{
    class week2_이상한문자만들기
    {
        static void Main(string[] args)
        {
            Console.WriteLine(Solution.solution("try hello world")); 
        }

        public class Solution
        {
            static public String solution(String s)
            {
                int count = 0;
                StringBuilder sb = new StringBuilder();
                string sub =string.Empty;
                for (int i = 0; i < s.Length; i++)
                {
                    sub = s.Substring(i, 1);
                    if (sub == " ")
                        count = 0;
                    else
                    {
                        if (count % 2 == 0)
                            sub = sub.ToUpper();
                        else
                            sub = sub.ToLower();
                        count++;
                    }
                    sb.Append(sub);
                }
                return sb.ToString();
            }
        }
    }
}

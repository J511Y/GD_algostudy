using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Programmers
{
    class Week2_문자열다루기기본
    {
        class Solution
        {
            public bool solution(String s)
            {
                bool answer = false;
                if(s.Length == 4 || s.Length == 6)
                {
                    int a = 0;
                    answer = int.TryParse(s, out a);
                }
                return answer;
            }
        }
    }
}

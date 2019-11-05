using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Programmers
{
    class Week2_문자열내p와y의개수
    {
        class Solution
        {
            bool solution(String s)
            {
                s = s.ToUpper();
                int pcount=0;
                int ycount=0;

                string sub = string.Empty;
                for (int i = 0; i < s.Length; i++)
                {
                    sub = s.Substring(i, 1);
                    if (sub == "P")
                        pcount++;
                    else if (sub == "Y")
                        ycount++;
                }

                if(pcount == ycount)
                {
                    return true;
                }
                return false;
            }
        }
    }
}

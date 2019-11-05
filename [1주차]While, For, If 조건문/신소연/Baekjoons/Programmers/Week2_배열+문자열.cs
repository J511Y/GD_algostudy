using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Programmers
{
    class Solution
    {
        public bool solution(String[] phone_book)
        {
            for (int i = 0; i < phone_book.Length; i++)
            {
                for (int j = 0; j < phone_book.Length; j++)
                {
                    if (phone_book[i].StartsWith(phone_book[j]))
                        return true;
                }
            }
            return false;
        }
    }
}

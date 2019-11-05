using System;

namespace Baekjoons_2
{
    class _2주차_문자열_알파벳찾기_10809
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            char[] cStr = str.ToCharArray();

            // 초기화
            int[] alphabet = new int[26];
            for (int i = 0; i < alphabet.Length; i++)
            {
                alphabet[i] = -1;
            }

            //연산
            for (int i = 0; i < cStr.Length; i++)
            {
                int a = (int)cStr[i] - 'a';
                if (alphabet[a] == -1)
                    alphabet[a] = i;
            }
            
            //출력
            for (int i = 0; i < alphabet.Length; i++)
            {
                Console.Write(alphabet[i] + " "); 
            }
        }
    }
}

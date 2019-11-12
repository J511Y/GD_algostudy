package study3;

import java.io.*;

public class Main_4949 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String input = br.readLine();
			//괄호가 하나도 없어도 균형잡힌 문자열로 간주
			if (input.equals(".")) {
				bw.flush();
				bw.close();
				return;
			}
			char[] stack = new char[input.length()];
			int cursor = 0;
			boolean result = true;
			//문자열에서 문자하나씩 비교
			for (char one : input.toCharArray()) {
				switch (one) {
				case '(':
				case '[':
					stack[cursor++] = one;
					break;
				case ')':
					if (cursor == 0 || stack[--cursor] != '(')
						result = false;
					break;
				case ']':
					if (cursor == 0 || stack[--cursor] != '[')
						result = false;
					break;
				}

				if (!result)
					break;
			}
			//다끝났는데도 0이 아니면 실패한거임.
			if (cursor > 0)
				result = false;

			if (!result)
				bw.write("no\n");
			else
				bw.write("yes\n");
		}
	}
}
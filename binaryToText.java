import java.util.*;

public class binaryToText
{
	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<>();
		List<String> arrList = new ArrayList<String>();
		Collections.addAll(arrList, " " , "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/",
			"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ":", ";", "<", "=", ">", "?", "@", "A", "B", "C", "D",
			"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
			"Z", "[", "\\", "]", "^", "_", "`", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
			"o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "{", "|", "}", "~");

		for(int i = 32; i <= 126; i++)
		{
			map.put(i, arrList.get(i - 32));
		}

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().replaceAll("\\s+","");
		String words[] = input.split("(?<=\\G.{" + 8 + "})");

		for(int i = 0; i < words.length; i++)
		{
			System.out.print(map.get(Integer.parseInt(words[i], 2)));
		}
	}
}
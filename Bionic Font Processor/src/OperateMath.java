
public class OperateMath {
	public static int boldWord(int length, int level) 
	{
		int val = 0;
		val = (int) Math.ceil(length * ((double) level/100));
		return val;
	}
}

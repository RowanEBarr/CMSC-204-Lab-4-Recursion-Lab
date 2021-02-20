
public class ArraySum {
	public int sumOfArray(Integer[] myArray, int index) {
		int sumOfArrayOffset;
		if (index == 0)
		{
			return myArray[0];
		}
		else
		{
			index--;
			sumOfArrayOffset = sumOfArray(myArray, index);
			index++;
			return myArray[index]+sumOfArrayOffset;
		}
	}

}

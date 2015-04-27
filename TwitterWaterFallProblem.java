public class TwitterWaterFallProblem{

	public static void main (String[] args) throws java.lang.Exception
	{
		int[] myIntArray = {2, 5, 1, 2, 3, 4, 7, 7, 6}; 
		System.out.println(calculateVolume(myIntArray));
	}
	


public static int calculateVolume(int[] land) {
		
		int leftMax = 0;
		int rightMax = 0;
		int left = 0;
		int right = land.length - 1;
		int volume = 0;
		
		while(left < right) {
			if(land[left] > leftMax) {
				leftMax = land[left];
			}
			if(land[right] > rightMax) {
				rightMax = land[right];
			}
			if(leftMax >= rightMax) {
				volume += rightMax - land[right];
				right--;
			} else {
				volume += leftMax - land[left];
				left++;
			}
		}
		return volume;
	}
}
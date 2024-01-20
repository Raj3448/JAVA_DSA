//Search Insert Position (LeetCode-35)
//
//Given a sorted array of distinct integers and a target value, return the index
//if the target is found. If not, return the index where it would be if it were
//inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//Input: nums = [1,3,5,6], target = 7
//Output: 4
//
//Constraints:
//1 <= nums.length <= 104
//-104 <= nums[i] <= 104
//nums contains distinct values sorted in ascending order.
//-104 <= target <= 104
class SearchInserPosition {

	static int inserPos(int []numArr,int target){

		int start = 0;
		int end = numArr.length - 1;
		int mid = (start+end) /2;
		while(start<=end){

			if(numArr[mid] == target){
				return mid;
			}
			else if(numArr[mid] > target){
				end = mid-1;
			}
			else if(numArr[mid] < target){

				start = mid+1;
			}
			mid = (start+end)/2;
		}
		return mid+1;
	}

	public static void main(String [] args) {
	
		int numArr[] = new int[]{1,3,5,6,7};
		int targetVal = 7;

		int ret = inserPos(numArr,targetVal);

		System.out.println("Output "+ret);
	}
}

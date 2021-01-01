import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,3,5,7, 2, 0, 6};
		List <Integer> list = range(array, 5, 2);
		for(int i: list) {
			System.out.print(i + ", ");
		}

	}
	
	public static List <Integer> range (int [] array, int x, int k) {
		int low = x-k;//get the lower value for the range we are searching in
		int high = x+k;//get the higher value for the range we are searching in
		List <Integer> list = new ArrayList <Integer> ();
		for(int i: array) {
			if(i>= low && i<= high) {//if the value fits in the range 
				list.add(i);//add it to the list
			}
		}
		return list;
	}
}

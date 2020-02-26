/** Name: Blake Patterson
 * Class ID: 322
 * Assignment #2
 * 
 * Simple List creates a list of integers using an array
 */
package cse360assign2;

/**
 * This class simple List is used to operate and create an array.
 * The operations include add, remove, Count, toString, search
 * @author blakepatterson
 *
 */
public class SimpleList {
	int list[];
	int count;
	/**
	 * function creator
	 */
	public SimpleList() {
		list = new int[10];
		count = 0;
	}
	/**
	 * adds an element at the begining of the array, moves other elements
	 * and increments count
	 * @param put the integer that is to be put into the array
	 */
	public void add(int put) {
		
		for(int i = count; i >= 0; i--) {
			list[i+1] = list[i];
		}
		list[0] = put;	
		if (count == 10) {
			
		}else {
			count++;
		}
	}
	/**
	 * removes the integer given as an argument 
	 * @param spot the integer that will be removed from the array
	 */
	public void remove(int spot) {
		if(search(spot) >= 0) {
			for(int i = search(spot); i < 9; i++) {
				list[i] = list[i + 1];
			}
			count--;
		}
	}
	/**
	 * this returns the count or the number of elements in the array
	 * @return count 
	 */
	public int count() {
		return count;
	}
	/**
	 * converts the integers in the array into a string
	 * @return numList
	 */
	public String toString() {
		String numList = "";
		for(int i = count; i > 0; i--) {
			numList = numList + list[i-1];
		}
		return numList;
	}
	/**
	 * looks through the array of integers and finds the desired integer
	 * then returns the index of the integer
	 * @param spot the integer that is searched for
	 * @return found
	 */
	public int search(int spot) {
		int found = -1; 
		for(int i = 0; i < 10; i++) {
			if(spot == list[i]) {
				found = i;
			}
		}
		return found;
	}
}
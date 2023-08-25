package com.java.array;

public class Binery_Search {
	public static void binerySearch(int arr[],int key) {
		int low = 0;
		int high= arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				System.out.println("Enter found the element"+mid);
				break;
			}
			
			else if(arr[mid]>key) {
					high = mid-1;
				}
				else
					if(arr[mid]<key) {
						low = mid+1;
					}
		}
			System.out.println("Element no not found");
		
		
		
	
	}

	public static void main(String[] args) {
		int arr[]= {3,4,13,53,1,5,44,234,3342,2242,55};
		binerySearch(arr,3);
		

	}

}

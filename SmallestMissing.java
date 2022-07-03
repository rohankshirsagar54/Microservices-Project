package Arrays;

public class SmallestMissing {
	
	
public static int search(int ar[],  int size) 
{ 
int left = 0, right = size - 1; 
int mid = 0; 
   
   
while ((right-left)>1) 
{ 
  mid = (left + right) / 2; 
  if ((ar[mid] - ar[left]) != mid-left) {
      right = mid; 
  }
  else if ((ar[right] - ar[mid]) != (right - mid)) {
      left = mid; 
  }

} 
return (ar[mid]+1);
}

	public static void main(String[] args) {
		
		
		 int ar[] = { 1, 2, 3, 4, 5, 6, 8 }; 
		    int size = ar.length; 
		    System.out.println("Missing number: " + search(ar, size)); 
	}

}

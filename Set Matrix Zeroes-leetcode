Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 

Follow up:

A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?

CODE:
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r  = matrix.length ;
        int c = matrix[0].length ;
        int target = 0 ;
        ArrayList<Integer> location = new ArrayList<Integer>();
        
        for(int i = 0; i<r; i++) {
        	for(int j=0; j<c; j++) {
        		if(matrix[i][j]==target){
        			location.add(i);
        			location.add(j);
        		
        		}
        	}
        }
        for(int k =0; k<location.size(); k++) {
        	if(k%2==0) {
        		int rowToVanish = (int)location.get(k);
        		for(int m=0; m<c; m++) {
        			matrix[rowToVanish][m] = 0 ;
        		}
        	}
        	else {
        		int colToVanish = (int)location.get(k);
        		for(int m=0; m<r; m++) {
        			matrix[m][colToVanish] = 0 ;
        		}
        		
        	}
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}

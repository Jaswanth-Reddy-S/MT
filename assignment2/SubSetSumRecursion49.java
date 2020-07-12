package assignment2;

public class SubSetSumRecursion49 {
    public static void find(int[] A, int currSum, int index, int sum,
          int[] solution) {
        if (currSum == sum) {
          for (int i = 0; i < solution.length; i++) {
            if (solution[i] == 1) {
              System.out.print( A[i]+" ");
            } 
          }
          System.out.println();
        } else if (index == A.length) {
          return;
        } else {
          solution[index] = 1;// select the element
          currSum += A[index];
          find(A, currSum, index + 1, sum, solution);
          currSum -= A[index];	
          solution[index] = 0;// do not select the element
          find(A, currSum, index + 1, sum, solution);
        }
        return;
      }
      public static void main(String[] args) {
        int[] A = {1,2,5,6,8};
        int[] solution = new int[A.length];
        find(A, 0, 0, 9, solution);
      }
}
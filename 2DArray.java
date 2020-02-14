public class 2DArray{
  public static void main(String[] args){

  private boolean even;
  private int sum;
  private int min;

  int array [][] = {  {4,1,8,5},
                      {0,2,3,4},
                      {6,6,2,2} };

    public boolean evenRow(int[][] mat, int row){
      for(int i = 0; i < mat.length; i++){
        if(mat[row][i] % 2 != 0){
          even = false;
        }
      }
      return even;
    }

    public boolean oddColSum(int[][] nums, int col){
      for(int i = 0; i < nums.length; i++){
        sum = sum + nums[i][col];
      }
      if(sum % 2 != 0){
        return true;
      }else{
        return false;
      }
    }

    public int[] minRow(int[][] nums){
      min = nums[0][0];
      minRow = nums[0];
      int[] numsFinal = new int[nums[k].length];
      for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums[k].length; i++){
          if(nums[i][j] < min){
            min = nums[i][j];
            minRow = i;
          }
        }
      }
      return nums[minRow];
    }

}
}

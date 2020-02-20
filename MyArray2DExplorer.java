
public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };



        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRow(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.println("} \n");

        System.out.println("Test minRow that finds smallest int in row:");
        System.out.println(exp.minRow(array, 0) + "\n");

        System.out.println("Test maxRow:");
        System.out.println(exp.maxRow(array, 1) + "\n");

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
          System.out.print(colMaxs[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
          System.out.print(avg[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

        System.out.println();

    }

    //WRITE YOUR METHODS BELOW

    public boolean evenRow(int [][] mat, int row){
      boolean even = true;
      for(int i = 0; i < mat.length; i++){
        if(mat[row][i] % 2 != 0){
          even = false;
        }
      }
      return even;
    }

    //returns true if the sum of the numbers the given col is odd.
    public boolean oddColSum(int [][] nums, int col){
      int sum = 0;
      for(int i = 0; i < nums.length; i++){
        sum = sum + nums[i][col];
      }
      if(sum % 2 != 0){
        return true;
      }else{
        return false;
      }
    }



    public int[] minRow(int [][] mat){
      int min = mat[0][0];
      int minRows = 0;
      int[] matsFinal = new int[mat[0].length];
      for(int i = 0; i < mat.length; i++){
        for(int j = 0; j < mat[0].length; j++){
          if(mat[i][j] < min){
            min = mat[i][j];
            minRows = i;
          }
        }
      }
      return mat[minRows];
    }

    public int minRow(int[][] nums, int row){
      int min = nums[row][0];
      for(int i = 0; i < nums.length; i++){
        if(nums[row][i] < min){
          min = nums[row][i];
        }
      }
      return min;
    }

    public int maxRow(int[][] nums, int row){
      int max = nums[row][0];
      for(int i = 0; i < nums[row].length; i++){
        if(nums[row][i] > max){
          max = nums[row][i];
        }
      }
      return max;
    }

    public int[] colMaxs(int[][] matrix){
      int[] maxs = new int[matrix[0].length];
      for(int i = 0; i < matrix[0].length; i++){
        int max = matrix[0][i];
        for(int j = 0; j < matrix.length; j++){
          if(matrix[j][i] > max){
            max = matrix[j][i];
          }
        }
        maxs[i] = max;
      }
      return maxs;
    }

    public int[] allRowSums(int[][] data){
      int[] sums = new int[data.length];
      int sum = 0;
      for(int i = 0; i < data.length; i++){
        for(int j = 0; j < data[0].length; j++){
          sum = sum + data[i][j];
        }
        sums[i] = sum;
        sum = 0;
      }
      return sums;
    }

    public double[] averageCol(int[][] nums){
      double[] sums = new double[nums[0].length];
      for(int i = 0; i < nums[0].length; i++){
        int sum = 0;
        for(int j = 0; j < nums.length; j++){
          sum = sum + nums[j][i];
        }
        sums[i] = sum / (double) nums.length;
        sum = 0;
      }
      return sums;
    }

    public int smallEven(int[][] matrix){
      int min = matrix[0][0];
      for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
          if(matrix[i][j] < min && matrix[i][j] % 2 == 0){
            min = matrix[i][j];
          }
        }
      }
      return min;
    }

    public static int biggestRow(int[][] nums){
      int maxRow = 0;
      int[] sums = new int[nums.length];

      int sum = 0;
      for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums[0].length; j++){
          sum = sum + nums[i][j];
        }
        sums[i] = sum;
        sum = 0;
      }

      for(int i = 0; i < sums.length; i++){
        if(sums[i] > sums[maxRow]){
          maxRow = i;
        }
      }
      return maxRow;
    }

}

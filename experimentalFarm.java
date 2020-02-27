publpublic class ExperimentalFarm

{

private Plot[][] farmPlots;



public ExperimentalFarm(Plot[][] p)

{

/* implementation not shown */

}



/** Returns the plot with the highest yield for a given crop type, as described in part (a). */

public Plot getHighestYield(String c){
  Plot maxP = null;
  int maxY = -1;
  for(int i = 0; i < farmPlots.length; i++){
    for(int j = 0; j < farmPlots[0].length; j++){
      Plot p = farmPlots[i][j];
      if(p.getCropType().equals(c) && p.getYield() > maxY){
        maxP = p;
        maxT = p.getYield();
      }
    }
  }
  return maxP;

}



/** Returns true if all plots in a given column in the two-dimensional array farmPlots

* contain the same type of crop, or false otherwise, as described in part (b).

*/

public boolean sameCrop(int col)

{

/* to be implemented in part (b) */

}

}

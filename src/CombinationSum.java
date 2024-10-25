import java.util.List;
import java.util.ArrayList;
public class CombinationSum {
    public static void main(String[] args) {
        
        //standard test
        int[] numbers = {2,5,7,9};
        int target = 7;
        List<List<Integer>> solution =combinationSum(numbers,target); //standard test
        System.out.println("standard test: "+ solution);

        //target doesnt exist test
        int[] numbers1 = {2,2,2,2,}; 
        solution =combinationSum(numbers1,target);
        System.out.println("\n target doesnt exist: "+ solution);

        //test with empty list
        int[] numbers2 = {}; 
        solution =combinationSum(numbers2,target);
        System.out.println("\n empty list: "+ solution);

        //test with all elements equal to target
        int[] numbers3 = {7,7,7,7}; 
        solution =combinationSum(numbers3,target);
        System.out.println("\n all elements equal target: "+ solution);
        //test with target 0
        target = 0;
        int[] numbers4 = {7,7,7,7}; 
        solution =combinationSum(numbers4,target);
        System.out.println("\n target is 0: " + solution);

    }
    /* this is the method the user will call to find
     * combinationsum.
     * INPUTS: an array of numbers, and a sumtarget
     * OUTPUTS: a list of a list of all possible ways the
     * array could form the sumtarget
    */
    public static List<List<Integer>> combinationSum(int[] numbers,int sumTarget) {
        List<List<Integer>> solutionList = new ArrayList<>();                    //create a list to hold solutions
        findCombination(0,numbers,sumTarget,solutionList,new ArrayList<>()); //call the helper recursive function
        return solutionList;
    }
    /*this method is the helper function which does the recursive backtracking.
     *INPUTS:current indices,the array of numbers being tested,
     *       the sumTarget,the current solutionlist, and a templist hold potential solutions.
     *OUTPUTS:uses recursion to check each indices of the array for
     solutions by trying to reach the target in every possible way, starting with multiple
     nums of the current indices.
     */
    private static void findCombination(int ind, int[] numbers, int sumTarget,List<List<Integer>> solutionList,List<Integer> tempList) {
        if(ind == numbers.length) {                                                            //base case if all indexes have been tried and
            if(sumTarget == 0) {                                                               //if the sum target gets decremented to zero
                solutionList.add(new ArrayList<>(tempList));                                   //then we can add the solutions to the list
                                              
            }
            return;                                                                            //return from recursion once all indices checked
        }
        if(numbers[ind] <= sumTarget) {                                                        //if number is less than or equal to sum target, it is valid to
            tempList.add(numbers[ind]);                                                        //add it to our temp solutions
            findCombination(ind, numbers, sumTarget - numbers[ind], solutionList, tempList);   //recursive call to check adding the same number
            tempList.remove(tempList.size() - 1);                                              //once target is passed we can remove the last number from the templist
        }
        findCombination(ind + 1, numbers, sumTarget, solutionList, tempList);                  //and check the next indices from the list of numbers
    }
}


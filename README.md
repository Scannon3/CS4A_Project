High-Level Description: Given an array of integers, and a target, this method will use recursive backtracking to exhaust all of the possible options
of the given integers that add up to the targetsum. Since the same number can be used multiple times, recursive backtracking makes for a clean solution
to the problem since we want to check all possible combinations of numbers. The recursion calls itself until there are no more indexes left to check, and
if there are no numbers it will add the current temp solution list to the actual solution list.

Model: The parameters for the recursive call are the:
index- where either the current index or the next index over are checked based on if we have exceeded the target sum,
array- the array of numbers that is being used to form possible solutions,
targetsum- the sum we are checking against, is decremented each recursive call by the number that was added to the possible solutions list.
solutionlist- this is the actual list that contains lists of solutuions. each list inside this list will add up to the targetsum.
templist- this is the temporary solution list that numbers are added to and taken away from until a match is found.

Testing Program: in the main method different arrays of numbers are generated and tested, and the solutions are printed.

Inputs and Outputs: Input Example inputs to the solver and the expected output.
PUBLIC METHOD INPUTS AND OUTPUTS: 
      INPUTS:  an array of numbers, and a sumtarget
      OUTPUTS: a list of a list of all possible ways the
               array could form the sumtarget.
PRIVATE HELPER RECURSION FUNCTION INPUTS AND OUTPUTS:
      INPUTS: current indices,the array of numbers being tested,
              the sumTarget,the current solutionlist, and a templist hold potential solutions.
      OUTPUTS: uses recursion to check each indices of the array for
               solutions by trying to reach the target in every possible way, starting with multiple
               nums of the current indices.
    







## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

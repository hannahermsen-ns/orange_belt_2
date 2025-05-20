High-level plan:
1. Add pre-commit hook for conventional commits CANCELLED
2. Run the cookie cutter to set up the project X
3. Run the tests to verify that everything is green X
4. Spend one pomodoro on trying to set up a github actions pipeline that runs the code, the tests and the quality gate NO TIME FOR THIS
5. Read one of the files in the code base and identify code smells by adding code comments. Time: 1 pomodoro X
6. Solve the code smells, using the refactoring priority premise. Make sure that tests stay green and coverage stays at 100%. Time: 2 pomodoros

Code smell solving plan:
1. Fix all "unclear naming" code smells (refactor readability as per the refactoring priority premise)
   2. Solve unclear naming in constructor parameter name X
   3. Solve unclear naming in constructor itself X
   4. Rename go function name X
   5. Rename go function parameter name X
   6. Rename c variable in the executeInstructions method X
   7. Rename xyd instance variable X
   8. Rename rs variable X
   9. Rename members of RoverState X
2. Reduce size of the executeInstructions method (reduce complexity, as per the refactoring priority premise)
   3. Extract handling instructions for each possible direction X
   4. Extract logic that handles an instruction to a separate function X
3. Reduce duplication of switch statements checking the commands (reduce complexity, as per the refactoring priority premise)
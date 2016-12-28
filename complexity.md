# Complexity

###### A measure of algorithms' efficiency based on input size

## Big O Notation

###### Time complexity of the worst case

##### We don't care about exact measures, just the rate of change

Throw away the constants
  - O(N) == O(2N+1)

##### Common Orders of complexity:

 - O(1)
    - Constant time.
    - Always takes roughly same time no matter input.
    - Usually occurs when we have a math formula we just plug and chug
        - Min/Max of two numbers
        - Average of two numbers
 - O(log_2(N))
 - O(N)
    - Linear time.
    - Time is directly linearly correlated with size of input.
    - Time for 8 elements is double that of 4, 4 is double that of 2 elements, etc.
    - Often occurs in single-pass array operations or very efficient String operations
        - Average of N numbers
        - Finding first index of a character
 - O(N*logN)
    - Often sorts aim to be here
        - Merge Sort <--
 - O(N^2)
    - Naive string matching
    - Basic sorting methods
        - Insertion sort
        - Selection sort
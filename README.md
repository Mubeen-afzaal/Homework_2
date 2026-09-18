# Homework_2

Name: Mubeen Afzaal
Programming Language: Java
IDE / Editor: IntelliJ IDEA

Part 4 -- Bubble Sort Big O
Q1. What is the worst-case Big O time complexity of Bubble Sort?
O(n^2)

Q2. Why does Bubble Sort have this time complexity?
Bubble sort have this time complexity because it uses nested loops and kind of repeatedly compares the neighboring
elements making sure the greater elements moves to the end.

Q3. If Bubble Sort processes 10 elements, approximately how many comparisons could be required compared with 1,000
elements?
For 10 elements O(n^2), it would require approximately 100 operations and for 1000 elements O(n^2), it would require
approximately 1,000,000 operations

Part 6 -- Compare Bubble Sort and Merge Sort
Q4. What is the Big O time complexity of Merge Sort?
O(n log n)

Q5.Which algorithm generally performs better when the amount of data becomes very large?
Merge sort performs better with larger set of data because it divides the array into smaller pieces
before sorting the array.

Q6. Complete the following:
Bubble Sort = O(n^2  )
Merge Sort = O(n log n)

Part 11 -- Searching Questions
Q7. What is the Big O time complexity of Linear Search?
O(n)

Q8. What is the Big O time complexity of Binary Search?
O(log n)

Q9. Why does Binary Search require sorted data?
Binary search requires sorted data because after finding the midpoint it decides which half of the array to look
for if the target is greater than or less than the middle value and if the array is not sorted it won’t be possible
to eliminate half of the array.

Q10. Which search would you use if the data were not sorted?
Linear Search because it doesn’t require sorted array and checks every element one by one but does take more time.

Q11. Which search would generally be better for a very large sorted array?
Binary search because it eliminates half of the array each time, whereas Linear search would have to check every
single element.

Part 12 -- Algorithm Comparison Table
Algorithm	                Purpose	                Big O
Bubble Sort	                Sorting	                O(n^2)
Merge Sort	                Sorting	                O(n log n)
Linear Search	            Searching	            O(n)
Binary Search	            Searching	            O(log n)

Part 13 -- Final Program Output
Original array
[42, 17, 8, 63, 29, 51, 4, 76, 35, 12, 90, 24]

Bubble sort Result:
[4, 8, 12, 17, 24, 29, 35, 42, 51, 63, 76, 90]

Merge sort Result:
[4, 8, 12, 17, 24, 29, 35, 42, 51, 63, 76, 90]

Linear Search Result:
Target: 35
Target found at index 8

Binary Search Result:
Target: 35
Target found at index 6



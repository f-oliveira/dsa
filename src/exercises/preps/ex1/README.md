Given the binary representation of pixels denoted by image, find the minimum number of operations needed to produce its reverse. Example

The pixel representation is image = "0100110",

The reverse of the image, i.e, the reverse of the string, is "0110010", and it can be produced using the following sequence of operations.

The string cannot be reversed in fewer than 3 operations, return 3.

function description
Complete the function findMinimumOperations in the editor below.

findMinimumOperation has the following parameter:
String image: a binary string that represents an image

return is int: the minimum number of operations required to produce a reverse, i.e, to reverse the string.

Sample input = 00110101
Sample output = 3
;
Explanation: The string can be reversed in minimum 3 moves using the following sequence:

1. 00110101 -> 00101011
2. 00101011 -> 01010110
3. 01010110 -> 10101100
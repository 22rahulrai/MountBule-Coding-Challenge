### Number Line jumps

You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
The first kangaroo starts at location  and moves at a rate of  meters per jump.
The second kangaroo starts at location  and moves at a rate of  meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.
Example
After one jump, they are both at , (, ), so the answer is YES.
Function Description
Complete the function kangaroo in the editor below.
kangaroo has the following parameter(s):
int x1, int v1: starting position and jump distance for kangaroo 1
int x2, int v2: starting position and jump distance for kangaroo 2
Returns
string: either YES or NO
Input Format
A single line of four space-separated integers denoting the respective values of , , , and .
Constraints
Sample Input 0
0 3 4 2
Sample Output 0
YES

Explanation 0
The two kangaroos jump through the following sequence of locations:
Sample Input 1
0 2 5 3
Sample Output 1
NO
Explanation 1
The second kangaroo has a starting location that is ahead (further to the right) of the first kangaroo's starting location (i.e., ). Because the second kangaroo moves at a faster rate (meaning ) and is already ahead of the first kangaroo, the first kangaroo will never be able to catch up. Thus, we print NO

```java
public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        //case 1:
        if(v1==v2){
            return (x1==x2) ? "YES" :"NO";
        }
        
        if(v2>v1){
            return "NO";
        }
        
        int position=x2-x1;
        int jump=v1-v2;
        
        if(position/jump>=0 && position%jump==0){
            return "YES";
        }
        
        return "NO";
    }
```
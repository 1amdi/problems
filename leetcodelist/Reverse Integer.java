翻转整数

Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

http://www.cnblogs.com/springfor/p/3886419.html

 if(res>(Integer.MAX_VALUE-num%10)/10)//非常巧妙的判断了越界问题,在res翻10倍之前，提前判断res是否会越界

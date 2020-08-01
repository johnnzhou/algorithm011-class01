# Lecture 12 Dynamic Programming

定义：Simplifying a complicated problem by breaking it down into simpler sub problems

最优解，最佳方式....
和 递归或者分治没有什么区别
divide and conquer + optimal substructure 

关键点：
* 最优子结构 opt[n] = bestOf(opt[n-1], opt[n-2] ...)
* 储存中间状态：opt[i]
* 递推公式
    * Fib: opt[i] = opt[n-1]  + opt[n-2]
    * 二维路径：opt[i,j] = opt[i+1, j] + opt[i, j+1]，且判断a[i,j]是不是空地
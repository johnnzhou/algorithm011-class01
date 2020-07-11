**回顾**：

树的面试题一般解法都是 recursion
1. 根据节点的定义
2. 重复性（自相似性）

Recursion
递归 - 循环
通过函数体来进行循环

1. 向下进入不同的递归层，向上又回到回来一层
2. 用参数来传递变量
3. 每一层其他的东西都是一份 copy

代码模板
1. recursion terminator 
2. process logic in current level
3. drill down
4. *reverse the current level status if needed

要点
1. 不要人肉进行递归（最大误区）
2. 找到最近最简的方法，拆解成重复子问题
3. 数学归纳法


```java
public void recur(int level, int param) {
    
    // terminator
    if (level > MAX_LEVEL) {
        // process result
        return;
    }
    
    // process current logic
    process(level, param);
    
    // drill down
    recur(level: level+1, newParam);
    
    // restore current status
}

```

例题讲解：
**BST的中序遍历是递增的**

---

Divide and Conquer

代码模板

```java
public static void divideConquer(problem, p1, p2 ...) {
    
    // recursion terminator
    if problem is null { 
        print result 
        return 
    }
    
    // prepare data
    data = prepareData(problem)
    subproblems = splitProblems(problem, data)
    
    // conquer subproblems
    sub1 = divideConquer(subproblems[0], p1 ...)
    sub2 = divideConquer(subproblems[1], p1 ...)
    
    
    // process and generate the final result
    result = processResult(sub1, sub2, ...)
    
    // revert the current level status
}

```


Backtracking (similar to generic recursion)
1. terminator
2. process current logic
3. drill down
4. reverse states 
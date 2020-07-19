
#### BFS, DFS
树搜索： 遍历
1. 所有节点都要访问一次
2. 所有节点仅只访问一次
3. 对于节点的访问顺序不限
    1. depth first search
    2. breadth first search 
4. Heuristic Search: 不同优先级搜索

DFS 代码示例
recursion:

多叉
```java
dfs(node, visited){

if (node : visited) {
    return;
}

    visited.add(node)
    
    // process current node here
    
    for (nextNode : node.children) {
        if (!visited.contains(nextNode) {
            dfs(nextNode, visited)
        }
    }
}
```

```java
dfs(node) {
    if node : visited {
    // already visited
        return;
    }
    
    visited.add(node);
    
    dfs(node.left)
    dfs(node.right)
}


```

non-recursion
```java
DFS(root) {
    if (root == null) {
        return [];
    }
    
    visited = [];
    stack = new Stack<>();
    
    while (!stack.isEmpty()) {
        node = stack.pop();
        visited.add(node);
        
        process(node)
        
        nodes = generateRealtedNodes(node);
        
        stack.push(nodes)
        
    }
    
}

```

BFS: queue (可以找到最短路径)

```java
DFS() {
    queue = new LinkedList<>();
    queue.add(root);
    visited.add(root);
    
    while (!queue.isEmpty()) {
        node = queue.pop();
        
        visited.add(node)
        
        process(node);
        
        nodes = generatedRelatedNodes(node);
        queue.push(nodes)
    }
}


```

#### Greedy
每一步都采取当前状态下最好的选择，希望导致全局最好最优。

**Greedy**：当前做局部最优判断

**Backtracking**：能够回退

**动态规划**：最优判断 + 回退 （保存）


Greedy 可以解决一些最优化问题：求最小生成树，求 Huffman Code（最优，最近，最好） 

Scenario：
问题能够被分解成子问题来解决，子问题的最优解能递推到最终的最优解。这种子问题最优解称为最优子结构



#### Binary Search

Binary Search 的条件
1. 目标函数存在单调性 
2. 存在上下界 （bounded）
3. 能过通过索引访问 （index accessible)


模板
```
left, right = 0, array.length - 1

while left <= right:
    mid = (left + right) / 2
    if (array[mid]) == target:
        // find the target
        break or return result
    else if (array[mid] < target):
        left = mid + 1
    else:
        right = mid - 1
```


四步做题法
1. clarification
2. possible solutions
3. optimal code
4. testing

---

使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

```java

int binarySearch(int[] nums) {

    if (nums.length == 0) { return -1; }
    else if (nums[0] < nums[nums.length - 1]) {return -1;}

    int lo = 0;
    int hi = nums.length - 1;

    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if ( nums[mid] > nums[mid + 1] ) {
            return mid + 1;
        } else if ( nums[mid] < nums[mid -1] ) {
            return mid;
        } else if ( nums[mid] > nums[0] ) {
            lo = mid + 1;
        } else {
            hi = mid -1;
        }
    }

}

```
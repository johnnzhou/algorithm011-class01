# 学习笔记



### Hash Table
hash collisions -> 通过链表解决解决碰撞问题，或者使用更好的 Hash Function

### Map Set
Map: key-value pair, key is unique
Set: unique elements

contains: 
    hashSet: O(1)
    treeSet: O(log n)


### Tree

LinkedList 是特殊化的 Tree
Tree 是特殊化的 Graph

**Pre-order / In-order / Post-order**:
pre-order: root - left - right
in-order: left - root - right
post-order: left - right - root

Binary Search Tree: 
1. Search: O(log n)
2. Insert: O(log n)

In-order traversal：升序遍历
1. 左子树上所有节点的值均小于他的根节点
2. 右子树上所有节点的值均大于他的根节点


### Heap (Binary Heap, Fib Heap)
可以迅速找到一堆数中的最大值或最小值

findMax: O(1)
deleteMax: O(log N)
insert: O(log N)
decreaseKey: O(log n)

Properties:
Binary Heap 实现相对容易，通过 complete binary tree 实现的
1. 是一个完全树
2. 数中任意节点的值总是 >= 子节点的值

**Binary Heap 的实现**
1. Binary Heap 是通过 Array 来实现的
2. 假设 ”第一个元素“在数组中的索引为0的话
    1. 父节点和子节点的位置关系如下：
        1) 索引为`i` 的 left child 的索引是`(2*i + 1)`
        2) 索引为 `i` 的 right child 的索引是 `(2*i + 2)`
        3）索引为 `i` 的 父节点 的索引是 `floor((i-1) / 2)`

**Insert** 树的深度是 worst case O(log n)
1. 新元素一律插到 Heap 的尾部
2. 依次向上调整整个 Heap 的结构 (Heapify)

**Delete** O(log n)
1. 将 Heap 尾部的元素放到顶部
2. 依次向下调整整个 Heap 的结构 （和较大的那个进行交换）


### Graph(V,E)

**vertex**: 
1. In-degree, out-degree
2. 点与点之前：是否连通

**edge**
1. 有向和无向
2. 权重

无向矩阵沿着 diagonal 对称
有向矩阵 不对称


**一定要加 visited 这个集合**


**HashMap**
HashMap 储存的是 key-value pair，其中 key 是唯一的，但 value 不是唯一的。通过哈希的方式使得 access 任何一个 pair 都可以在 O(1) 复杂度完成。也因为是哈希的缘故，存在 hashMap 中的 object 并没有顺序。如果要遍历 hashMap 中的元素，除了可以用 `for each loop` 之外，还可以用 Iterator 进行遍历

access: `get(key)` O(1)
add: `put(key, value)`
remove: `remove(key)`
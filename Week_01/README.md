学习笔记

### Lecture 2：
* 一位数据结构
    * Basic
        * array
        * linked list
    * Advanced: stack(LIFO), queue(FIFO), deque, set, map(hash/tree)
* 二维数据结构
    * Basic
        * tree, grpah
    * Advanced
        * binary search tree(red-black, avl), disjoint set, trie
* 特殊数据结构
    * bitwise
    * bloom filter
    * URL cache

**五遍刷题法**

1: 5 mins: read the questions + think (if no clues: read the solutions directly) + 背诵 默写

2: 自己写 —->> submit on leetcode

3: after 24 hours, redo the problems

4: after a week, redo the problem

5: before interview


### Lecture 3:

Array
* access: O(1)
* insert: O(n)
* delete: O(n)
* find: O(1)

LinkedList
* **find: O(n)**
* prepend: O(1)
* append: O(1)
* insert: O(1)
* delete: O(1)

SkipList (在原有链表上增加一级索引（指向 next + 1）， 二级索引等)

Time Complexity:
假设第0层有 `n` 个nodes，第一层有 `n/2` 个 nodes，第二层有 `n/4`个nodes  .... 第k层有`n/(2^k)`个nodes。假设最后一层有2个nodes，那么 `n/(2^k) = 2 -> k = log(n) - 1`, amortized O(log n). 

**加速一般的实现方法是升级纬度（1维数据结构变成2维数据结构）**

只能用于链表里面元素有序的情况下，SkipList对标的是AVL Tree 和 Binary Search。 
**insert, delete, find are all O(log n)**

### Lecture 4:

Stack: LIFO  insert, delete O(1), find O(n)

Queue: FIFO  insert, delete O(1), find O(n)

Deque: 两端都可以进出, insert, delete O(1), find O(n)

Priority Queue: 按照元素的优先级排列，底层用了Heap  insert O(1) deleteMin O(log n)


### 新的 API 改写 Deque 的代码

```java
Deque<String> deque = new LinkedList<String>();

deque.addFirst("a");
deque.addFirst("b");
deque.addFirst("c");
System.out.println(deque);

String str = deque.peekFirst();
System.out.println(str);
System.out.println(deque);

while (deque.size() > 0) {
    System.out.println(deque.removeFirst());
}
System.out.println(deque);

```

### 分析 Queue 和 Priority Queue 的源码

在 Java 中，Queue是一个 `interface` 而不是 `class`，因此 Queue 只定义了这个 `interface` 支持的 methods，并且这些 methods 都只有 method signature 并没有 implementation。

而 Priority Queue 在 Java 中是一个 `class`并且 implement `Queue` 这个 interface，Queue 中定义的 methods Priority Queue都应该支持。Priority Queue 提供了7种  initialize 的方式，根据不同的 parameters，像 client 定义的 comparator，Priority Queue 的 capacity，Priority Queue 里面的elements 等等。

Priority Queue 中主要的 methods 包括：`clear`, `contains`, `offers`, `add`, `remove`。

在 `add` 中直接调用了 `offer()` 的实现，在 `offer` 中，先会检查 element 是不是 `null`，如果是的话，会直接 throw `NullPointerException()`。在添加之前会检查当前的 Queue 有没有足够的空间，如果没有的话会调用 `grow` 进行扩容。通过 size + 1 确保queue 的size是正确的。如果当前size是0的话，直接把新的element放在queue的 index 0；或者根据 Heap 的特性，把 element 放到正确的位置并且保持 底层 data structure 的特性 (balanced tree?)

`grow()` 会把当前的size + 2 如果size < 64, 或者通过 bitwise operation 直接扩大两倍。然后把当前 queue 里面所有的 element copy 到 新的queue。

`clear` 会用一个 for loop 把 queue 中的每一个元素都设置成 `null` 并且把 size 改成 0。

`contains` 会调用 `indexOf` 并检查返回值，如果返回值是其他不等于 -1 的值，说明 element 存在于 queue 中，反之不存在。

`indexOf` 是一个简单的 for loop，检查 queue 中的每一个元素，如果有 match 的元素，就返回当前的 index，反之返回-1。 Time Complexity O(n)

`remove`会检查要被移除的 element 是否在 queue 里面，如果不在的话直接return `false`。如果存在，那么直接调用 `removeAt`。

`removeAt`会根据 Heap 的特性进行 siftUp 或者 siftDown 以保持 Heap 的平衡性。如果要移除的 element 在尾巴上，那么会直接把最后一个 index 设置为 `null`




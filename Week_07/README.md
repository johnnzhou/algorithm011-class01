学习笔记

Lecture 13 Trie & Disjoint Set

**Trie**

基本性质：
1. 节点本身不存储完整单词
2. 从根节点到某一个节点，路径上经过的字符串连接起来，为该节点对应的字符串
3. 每一个节点的所有子节点路径代表的字符串都不相同

**核心**
用空间换时间


**Disjoint Set**
解决 组团，配对的问题 


`makeSet(s)`: 简历一个新的并查集，其中包含s个单元素集合
`unionSet(s)`: 把元素x和元素y所在的集合合并，要求x和y所在的集合不想交，如果相交则不合并
`find(x)`: 找到元素x所在的集合的代表，该操作也可以用于判断两个元素是否位于同一个集合，只要将他们各自代表比较一下就可以了。

```java
// Java
class UnionFind { 
	private int count = 0; 
	private int[] parent; 
	public UnionFind(int n) { 
		count = n; 
		parent = new int[n]; 
		for (int i = 0; i < n; i++) { 
			parent[i] = i;
		}
	} 
	public int find(int p) { 
		while (p != parent[p]) { 
			parent[p] = parent[parent[p]]; 
			p = parent[p]; 
		}
		return p; 
	}
	public void union(int p, int q) { 
		int rootP = find(p); 
		int rootQ = find(q); 
		if (rootP == rootQ) return; 
		parent[rootP] = rootQ; 
		count--;
	}
}

```
---

Lecture 14 高级搜索

优化方式：不重复，剪枝
方向：双向搜索，启发式搜索

---
Lecture 15 AVL, Red-black Tree

AVL
self-balance
平衡二叉树
每个节点存 balance factor -1,0,1
四种旋转操作

不足：节点需要存储额外的信息，且调整次数频繁

Red-black tree
近似平衡二叉树，能够确保任何一个节点的左右子树的高度差小于2倍。
* 每个节点要不是红色，要不是黑色
* 根节点是黑色
* 每个叶子节点（nil节点，空节点）是黑色
* 不能有相邻接的两个红色节点
* 从任意节点到其椰子节点所有路径都包含相同数目的黑色节点 

* AVL trees provides faster lookups than Red-black tree because it is more strictly balanced.
* Red-black tree provides faster insertion and removal operations than AVL tree as fewer rotations are done due to relatively relaxed balancing.
* AVL tree stores balance factors or heights with each node, thus requiring storage for an integer per node whereas Red-black tree requires only 1 bit of information per node.
* Red black tree are used in most of the languages libraries, such as Map, multimap, multiseinC++, whereas AVL trees are used in database where faster retrievals are required
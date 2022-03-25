package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
        public DLinkedNode() {}
        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
    private ArrayList<Integer> result = new ArrayList<Integer>();
    private int capacity;
    private int size;
    private DLinkedNode head, tail;

    public int[] LRU (int[][] operators, int k) {
        size = 0;
        capacity = k;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;

        for(int[] opat : operators){
            int key = opat[1];
            if (opat[0] == 1){
                set(key, opat[2]);
            } else if (opat[0] == 2){
                result.add(get(key));
            }
        }

        int[] resultArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node != null) {//如果存在node，则将node移动到head的位置
            moveToHead(node);
            return node.value;
        }
        return -1;
    }

    public void set(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {//如果不存在node, 则将node添加到双向链表的头部；还要判断链表是否满，如果满，则删除尾部
            DLinkedNode newNode = new DLinkedNode(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            ++ size;
            if (size > capacity) {
                DLinkedNode tail = removeTail();
                cache.remove(tail.key);
                --size;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode removeTail() {
        DLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }
}

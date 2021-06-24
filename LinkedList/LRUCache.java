package LinkedList;

import java.util.*;

public class LRUCache {
// Time: O(1) for both set & get method
// Space: O(1)
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    int capacity;
    Map<Integer, Node> map = new HashMap<>();

    // Constructor for initializing the cache capacity with the given value.
    class Node {
        Node prev, next;
        int key, value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    LRUCache(int cap) {
        capacity = cap;
        head.next = tail;
        tail.prev = head;
    }

    // Function to return value corresponding to the key.
    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }

    // Function for storing key-value pair.
    public void set(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    void insert(Node node) {
        map.put(node.key, node);
        Node headnext = head.next;
        head.next = node;
        node.prev = head;
        headnext.prev = node;
        node.next = headnext;
    }

    public static void main(String[] args) {
        System.out.println("Going to test the LRU " + " Cache Implementation");
        LRUCache cache = new LRUCache(2);

// it will store a key (1) with value 
// 10 in the cache.
        cache.set(1, 10);

// it will store a key (1) with value 10 in the cache.
        cache.set(2, 20);
        System.out.println("Value for the key: 1 is " + cache.get(1)); // returns 10

// evicts key 2 and store a key (3) with
// value 30 in the cache.
        cache.set(3, 30);

        System.out.println("Value for the key: 2 is " + cache.get(2)); // returns -1 (not found)

// evicts key 1 and store a key (4) with
// value 40 in the cache.
        cache.set(4, 40);
        System.out.println("Value for the key: 1 is " + cache.get(1)); // returns -1 (not found)
        System.out.println("Value for the key: 3 is " + cache.get(3)); // returns 30
        System.out.println("Value for the key: 4 is " + cache.get(4)); // return 40

    }

}

package Queue;

import java.util.*;

public class LRUCache {
    // Time: O(1) for both set & get method
    // Space: O(1)
    class Node {
        int key;
        int value;

        Node(int k, int v) {
            this.key = k;
            this.value = v;
        }
    }

    HashMap<Integer, Node> map = new HashMap<>();
    Deque<Node> dq = new LinkedList<>();
    int capacity;

    LRUCache(int cap) {
        this.capacity = cap;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        dq.remove(map.get(key));
        dq.addFirst(map.get(key));
        return map.get(key).value;
    }

    void set(int key, int value) {
        Node curr = map.containsKey(key) ? map.get(key) : null;
        if (curr == null) {
            curr = new Node(key, value);
            dq.addFirst(curr);
            map.put(key, curr);
        } else {
            curr.value = value;
            dq.remove(curr);
            dq.addFirst(curr);
        }
        if (map.size() > capacity) {
            curr = dq.removeLast();
            map.remove(curr.key);
        }
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

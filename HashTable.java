public class HashTable {

    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public HashTable() {
        this(10);
    }

    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[capacity];
    }

    private class HashNode {
        private int key;
        private String value;
        private HashNode next;

        public HashNode(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getBucketIndex(int key) {
        return key % buckets.length;
    }

    public void put(int key, String value) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        buckets[bucketIndex] = newNode;
    }

    public String get(int key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return null;
    }

    public String delete(int key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;
        while (head != null) {
            if (head.key == key) {
                break;
            }
            previous = head;
            head = head.next;
        }

        if (head == null) {
            return null;
        }
        size--;
        if (previous != null) {
            previous.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }
        return head.value;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.put(105, "Tom");
        ht.put(21, "Sana");
        ht.put(31, "Harry");
        System.out.println(ht.size());
        System.out.println(ht.get(105));
        System.out.println(ht.delete(21));
    }
}

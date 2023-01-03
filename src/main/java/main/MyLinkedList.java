package main;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
    }

    public void add(INode<K> newNode) {
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail == null) {
            this.tail = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode<K> newNode) {
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode<K> myNode, INode<K> newNode) {
        INode<K> tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode<K> search(K key) {
        if(this.head != null) {
            INode<K> tempNode = this.head;
            while(tempNode != null) {
                if((tempNode.getKey().equals(key) || (this.head.getKey().equals(key)))) {
                    return tempNode;
                }
                tempNode = tempNode.getNext();
            }
        }
        return null;
    }

    public INode<K> pop() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void remove(INode<K> myNode) {
        INode<K> tempNode = this.head;
        INode<K> removeNode = this.head;
        INode<K> previousNode = this.head;
        while(tempNode.getNext() != null) {
            previousNode = tempNode;
            if((tempNode.getNext() == myNode) || (this.head == myNode)) {
                removeNode = myNode.getNext();
                break;
            }
            tempNode = tempNode.getNext();
        }
        previousNode.setNext(removeNode);
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer(("\nMy Nodes : "));
        INode<K> tempNode = head;
        if(head == null) {
            System.out.println("\nSorry, LinkedList is Empty");
            return;
        }
        while(tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if(tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public int size() {
        if(this.head != null) {
            INode<K> tempNode = this.head;
            int count = 1;
            while(tempNode.getNext() != null) {
                count++;
                tempNode = tempNode.getNext();
            }
            return count;
        }
        return 0;
    }

    public boolean isEmpty() {
        if(this.head == null) {
            return true;
        }
        return false;
    }

    public Integer index(K key) {
        if(this.head != null) {
            INode<K> tempNode = this.head;
            int count = 0;
            while(tempNode != null) {
                if(tempNode.getKey() == key) {
                    return count;
                }
                count++;
                tempNode = tempNode.getNext();
            }
            return null;
        }
        return null;
    }

    @Override
    public String toString() {
        return "" +
                "head=" + head +
                ", tail=" + tail;
    }
}

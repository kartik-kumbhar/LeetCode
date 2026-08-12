class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    // Deque<Integer> d;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
        // d=new LinkedList<>();
    }

    public void push(int x) {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st2.push(x);

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        // d.addLast(x);
    }

    public int pop() {
        return st1.pop();
        // return d.removeFirst();
    }

    public int peek() {
        return st1.peek();
        // return d.peekFirst();
    }

    public boolean empty() {
        return st1.isEmpty();
        // return d.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
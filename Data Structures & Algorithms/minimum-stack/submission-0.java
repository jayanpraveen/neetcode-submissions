class MinStack {
    List<Integer> list;
    List<Integer> minList;
    public MinStack() {
        list = new ArrayList<>();
        minList = new ArrayList<>();
    }

    public void push(int val) {
        list.add(val);

        int min = minList.size() > 0 ? Math.min(minList.get(minList.size() - 1), val) : val;
        minList.add(min);
    }

    public void pop() {
        if (list.size() > 0) {
            list.remove(list.size() - 1);
            minList.remove(minList.size() - 1);
        }
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return minList.get(minList.size() - 1);
    }
}

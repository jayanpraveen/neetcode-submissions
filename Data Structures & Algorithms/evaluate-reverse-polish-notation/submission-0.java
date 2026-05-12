class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for (String str: tokens) {
            if (Set.of("+", "-", "*", "/").contains(str)) {
                int val2 = Integer.parseInt(stack.pop());
                int val1 = Integer.parseInt(stack.pop());

                int res = 0;
                switch (str) {
                    case "+": {
                        res = val1 + val2;
                        break;
                    }
                    case "-": {
                        res = val1 - val2;
                        break;
                    }
                    case "*": {
                        res = val1 * val2;
                        break;
                    }
                    case "/": {
                        res = val1 / val2;
                        break;
                    }
                }
                stack.push(res + "");
            } else {
                stack.push(str);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}

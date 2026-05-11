class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> box = new HashMap<>();

        for (int row = 0; row < board.length; row++) {
            rows.putIfAbsent(row, new HashSet<>());
            for (int col = 0; col < board[0].length; col++) {
                char element = board[row][col];
                if (element == '.') continue;

                cols.putIfAbsent(col, new HashSet<>());
                String boxKey = (row / 3) + "," + (col / 3);
                box.putIfAbsent(boxKey, new HashSet<>());
                
                if (
                    (rows.get(row).contains(element)) ||
                    (cols.get(col).contains(element)) ||
                    (box.get(boxKey).contains(element))
                ) {
                    return false;
                }

                rows.get(row).add(element);
                cols.get(col).add(element);
                box.get(boxKey).add(element);
            }
        }

        return true;
    }
}

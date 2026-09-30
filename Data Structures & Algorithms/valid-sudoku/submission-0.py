class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        colMap = defaultdict(list)
        rowMap = defaultdict(list)
        subboxMap = defaultdict(list)

        for row in range(len(board)):
            for col in range(len(board[row])):
                if board[row][col] == ".":
                    continue
                elif(board[row][col] in colMap[col] or
                    board[row][col] in rowMap[row] or
                    board[row][col] in subboxMap[row//3, col//3]):
                    return False
                else:
                    colMap[col].append(board[row][col])
                    rowMap[row].append(board[row][col])
                    subboxMap[row//3, col//3].append(board[row][col])

        return True
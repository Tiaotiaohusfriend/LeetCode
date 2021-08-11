import java.util.HashMap;
import java.util.Map;

public class YouXiaoDeShuDu {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Integer>[] mapRow = new HashMap[9];
        Map<Integer,Integer>[] mapColumn = new HashMap[9];
        Map<Integer,Integer>[] mapBox = new HashMap[9];
        for(int i=0; i<9; i++){
            mapRow[i] = new HashMap<Integer, Integer>();
            mapColumn[i] = new HashMap<Integer, Integer>();
            mapBox[i] = new HashMap<Integer, Integer>();
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char n = board[i][j];
                if(n != '.'){
                    int num = (int)n;
                    int box_num = (i/3)*3 + j/3;
                    mapRow[i].put(num,mapRow[i].getOrDefault(num,0));
                    mapColumn[j].put(num,mapColumn[j].getOrDefault(num,0));
                    mapBox[box_num].put(num,mapBox[box_num].getOrDefault(num, 0));
                    if(mapRow[i].get(num)>1 || mapColumn[j].get(num)>1 || mapBox[box_num].get(num)>1)
                        return false;
                }
            }
        }
        return true;
    }
}

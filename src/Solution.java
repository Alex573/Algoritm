import java.util.ArrayList;
import java.util.List;

/**
 * Algoritm find construct the shortest possible sequence of integers ending with N, using the following rules:
 * the first element of the sequence is 1; more specifically: A[0]=1
 * each of the following elements is generated by multiplying the previous element by 2, or, increasing it by 1;
 * more precisely: A[i]=A[i-1] * 2 or A[i]=A[i-1] +1, for i>=1
 */
public class Solution {
    public List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sequenceRecursi(30);
        solution.listPrint(solution.list);
        System.out.println("-----------------");
        Solution solution2 = new Solution();
        solution2.sequenceStand(70);
        solution2.listPrint(solution2.list);
        System.out.println("-----------------");


    }

    /* find the number */
    public int findNumber(int i) {
        if (i % 2 > 0) {
            return --i;
        } else {
            return i / 2;
        }
    }

    /* get a list with numbers standart */
    public List<Integer> sequenceStand(int i) {
        do {
            list.add(0, i);
            i = findNumber(i);
        } while (i >= 1);
        return list;
    }

    /* get a list with numbers recursion */
    public List<Integer> sequenceRecursi(int i) {
        if (i <= 0) {
            return list;
        } else {
            list.add(0, i);
            i = findNumber(i);
            sequenceRecursi(i);
        }
        return null;
    }

    /* print the sheet as in the task */
    public void listPrint(List<Integer> list) {
        for (int j = 0; j < list.size(); j++) {
            System.out.println("A[" + j + "] = " + list.get(j));
        }
    }
}

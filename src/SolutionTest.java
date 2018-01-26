import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/*
 * Test classa solution
 */
public class SolutionTest extends Assert {
    /* not change list */
    private List<Integer> list15 = Arrays.asList(1, 2, 3, 6, 7, 14, 15);
    private List<Integer> list45 = Arrays.asList(1, 2, 4, 5, 10, 11, 22, 44, 45);
    private List<Integer> list70 = Arrays.asList(1, 2, 4, 8, 16, 17, 34, 35, 70);

    /* check when even next /2 or when odd next -1 */
    @Test
    public void findNumberChetNechet() {
        assertEquals("Value are not equal", new Solution().findNumber(5), 4);
        assertEquals("Value are not equal", new Solution().findNumber(89), 88);
        assertEquals("Value are not equal", new Solution().findNumber(88), 44);
        assertEquals("Value are not equal", new Solution().findNumber(44), 22);
        assertEquals("Value are not equal", new Solution().findNumber(0), 0);
        assertEquals("Value are not equal", new Solution().findNumber(1), 0);
    }

    /* array compare Standart */
    @Test
    public void sequenceStandEqualsArray() {
        Solution solStand = new Solution();
        Solution solStand2 = new Solution();
        Solution solStand3 = new Solution();
        solStand.sequenceStand(15);
        solStand2.sequenceStand(45);
        solStand3.sequenceStand(70);
        List<Integer> listtest15 = solStand.list;
        List<Integer> listtest45 = solStand2.list;
        List<Integer> listtest70 = solStand3.list;
        assertEquals("arrays not same", list15, listtest15);
        assertEquals("arrays not same", list45, listtest45);
        assertEquals("arrays not same", list70, listtest70);
    }

    /* array compare Recursi */
    @Test
    public void sequenceRecursiEqualsArray() {
        Solution solRec = new Solution();
        Solution solRec2 = new Solution();
        Solution solRec3 = new Solution();
        solRec.sequenceStand(15);
        solRec2.sequenceStand(45);
        solRec3.sequenceStand(70);
        List<Integer> listtest15 = solRec.list;
        List<Integer> listtest45 = solRec2.list;
        List<Integer> listtest70 = solRec3.list;
        assertEquals("arrays not same", list15, listtest15);
        assertEquals("arrays not same", list45, listtest45);
        assertEquals("arrays not same", list70, listtest70);
    }

    /* array compare Stand and Recursi */
    @Test
    public void sequenceStandAndRecursi() {
        Solution solution = new Solution();
        solution.sequenceStand(1235165165);
        Solution solution2 = new Solution();
        solution2.sequenceRecursi(1235165165);
        assertEquals("arrays not same", solution.list, solution2.list);
    }

    /* check algoritm next number i*2 or i+1 Stand */
    @Test
    public void sequenceStandControlValue() {
        Solution solStand3 = new Solution();
        solStand3.sequenceStand(70);
        List<Integer> listtest = solStand3.list;
        for (int i = 0; i < listtest.size() - 1; i++) {
            if (listtest.get(i) * 2 != listtest.get(i + 1)) {
                if ((listtest.get(i) + 1 != (listtest.get(i + 1)))) {
                    fail("Does not satisfy condition(i*2 or i+1) " +
                            "Start el: " + i + " value " + listtest.get(i) +
                            " Control el: " + (i + 1) + " value " + listtest.get(i + 1));
                }
            }
        }
    }

    /* check algoritm next number i*2 or i+1 Recursi */
    @Test
    public void sequenceRecursiControlValue() {
        Solution solRec3 = new Solution();
        solRec3.sequenceStand(70);
        List<Integer> list = solRec3.list;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) * 2 != list.get(i + 1)) {
                if ((list.get(i) + 1 != (list.get(i + 1)))) {
                    fail("Does not satisfy condition(i*2 or i+1) " +
                            "Start el: " + i + " value " + list.get(i) +
                            " Control el: " + (i + 1) + " value " + list.get(i + 1));
                }
            }
        }
    }
}
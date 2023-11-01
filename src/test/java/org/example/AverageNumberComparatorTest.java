package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AverageNumberComparatorTest {

    private AverageNumberComparator comparator;

    @BeforeEach
    public void setUp() {
        comparator = new AverageNumberComparator();
    }

    @Test
    public void testCompareLists_FirstListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        String result = comparator.compareLists(list1, list2);
        Assertions.assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareLists_SecondListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        String result = comparator.compareLists(list1, list2);
        Assertions.assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareLists_AveragesAreEqual() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        String result = comparator.compareLists(list1, list2);
        Assertions.assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareLists_EmptyLists() {
        List<Integer> list1 = Arrays.asList();
        List<Integer> list2 = Arrays.asList();
        String result = comparator.compareLists(list1, list2);
        Assertions.assertEquals("Средние значения равны", result);
    }
}

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

    /**
     * Этот тест проверяет сценарий, когда первый список имеет большее среднее значение. В этом случае ожидается, что программа выведет сообщение "Первый список имеет большее среднее значение". Этот сценарий выбран, потому что он представляет ситуацию, когда разница в средних значениях списков явна.
     */
    @Test
    public void testCompareLists_FirstListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        String result = comparator.compareLists(list1, list2);
        Assertions.assertEquals("Первый список имеет большее среднее значение", result);
    }

    /**
     *  Этот тест проверяет сценарий, когда второй список имеет большее среднее значение. Ожидается, что программа выведет сообщение "Второй список имеет большее среднее значение". Этот сценарий выбран для проверки правильности обработки случая, когда второй список имеет большее среднее значение.
     */
    @Test
    public void testCompareLists_SecondListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        String result = comparator.compareLists(list1, list2);
        Assertions.assertEquals("Второй список имеет большее среднее значение", result);
    }

    /**
     * Этот тест проверяет сценарий, когда средние значения двух списков равны. Ожидается, что программа выведет сообщение "Средние значения равны". Этот сценарий выбран, чтобы убедиться, что программа правильно обрабатывает случай с равными средними значениями.
     */
    @Test
    public void testCompareLists_AveragesAreEqual() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        String result = comparator.compareLists(list1, list2);
        Assertions.assertEquals("Средние значения равны", result);
    }

    /**
     * Этот тест проверяет сценарий, когда оба списка пусты. Ожидается, что программа также выведет сообщение "Средние значения равны". Этот сценарий выбран, чтобы удостовериться, что программа корректно обрабатывает случай с пустыми списками.
     */
    @Test
    public void testCompareLists_EmptyLists() {
        List<Integer> list1 = Arrays.asList();
        List<Integer> list2 = Arrays.asList();
        String result = comparator.compareLists(list1, list2);
        Assertions.assertEquals("Средние значения равны", result);
    }
}

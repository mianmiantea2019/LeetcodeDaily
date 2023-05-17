package LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-16
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _707DesignLinkedListTest {
    private _707DesignLinkedList list;

    @BeforeEach
    public void setup() {
        list = new _707DesignLinkedList();
    }

    @Test
    public void testGet_EmptyList() {
        Assertions.assertEquals(-1, list.get(0));
    }

    @Test
    public void testAddAtHead() {
        list.addAtHead(1);
        Assertions.assertEquals(1, list.get(0));

        list.addAtHead(2);
        Assertions.assertEquals(2, list.get(0));
        Assertions.assertEquals(1, list.get(1));
    }

    @Test
    public void testAddAtTail() {
        list.addAtTail(1);
        Assertions.assertEquals(1, list.get(0));

        list.addAtTail(2);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
    }

    @Test
    public void testAddAtIndex() {
        list.addAtIndex(0, 1);
        Assertions.assertEquals(1, list.get(0));

        list.addAtIndex(1, 3);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(3, list.get(1));

        list.addAtIndex(1, 2);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    public void testDeleteAtIndex() {
        list.addAtHead(1);
        list.addAtTail(2);
        list.addAtTail(3);

        list.deleteAtIndex(1);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(3, list.get(1));

        list.deleteAtIndex(0);
        Assertions.assertEquals(3, list.get(0));
        Assertions.assertEquals(-1, list.get(1));
    }
}

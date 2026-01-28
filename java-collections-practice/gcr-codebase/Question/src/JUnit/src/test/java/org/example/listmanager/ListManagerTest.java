package org.example.listmanager;

import org.example.listManager.ListManager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListManagerTest {
    private ListManager manager;
    private List<Integer> list;

    @Before
    public void setup() {
        manager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        manager.addElement(list, 10);
        assertEquals(1, manager.getSize(list));
        assertTrue(list.contains(10));
    }

    @Test
    public void testRemoveElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertTrue(manager.removeElement(list, 10));
        assertEquals(1, manager.getSize(list));
    }

    @Test
    public void testGetSize() {
        manager.addElement(list, 1);
        manager.addElement(list, 2);
        manager.addElement(list, 3);

        assertEquals(3, manager.getSize(list));
    }

    @Test
    public void testRemoveNonExistingElement() {
        manager.addElement(list, 10);
        assertFalse(manager.removeElement(list, 99));
    }
}

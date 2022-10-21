package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListTest <T> extends List{
    ListTest<Integer> list;

    @BeforeEach
    public void init(){
        list = new ListTest<>();
    }

    @AfterEach  public void clear(){ list = new ListTest<>();
        list = null;
    }

    @Test
    public void addToTop(){
        list.insertHead(1);
        list.insertHead(2);
        assertEquals(2, list.d);
    }


    @Test
    public void addToList(){
        list.insert(1);
        list.insert(2);
        assertEquals(2, list.next.d);
    }



    @Test
    public void listPop(){
        list.insert(1);
        list.insert(2);
        list.insert(3);
        assertEquals(1, list.pop());
    }

    @Test
    public void removeData(){
        list.insert(1);
        list.insert(2);
        list.insert(3);
        assertTrue(list.rem(2));
    }

    @Test
    public void removeNotSavedData(){
        list.insert(1);
        list.insert(2);
        list.insert(3);
        assertFalse(list.rem(9));
    }

}
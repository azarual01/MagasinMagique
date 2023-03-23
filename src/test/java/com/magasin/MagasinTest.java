package com.magasin;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
//        https://www.youtube.com/watch?v=VREGsIsMNt0
        Item[] items = new Item[] {
                new Item("Comté", 0, 0),
                new Item("Comté", 0, 50),
                new Item("Comté", 5, 45),
                new Item("Comté", 10, 45),
                new Item("Comté", 20, 20),
                new Item("Comté", 0, 0),
                new Item("Comté", -10, -10),

                new Item("Pass VIP Concert", 0, 0),
                new Item("Pass VIP Concert", 0, 50),
                new Item("Pass VIP Concert", 5, 45),
                new Item("Pass VIP Concert", 10, 45),
                new Item("Pass VIP Concert", 20, 20),
                new Item("Pass VIP Concert", 0, 0),
                new Item("Pass VIP Concert", -10, -10),

                new Item("Kryptonite", 0, 0),
                new Item("Kryptonite", 0, 50),
                new Item("Kryptonite", 5, 45),
                new Item("Kryptonite", 10, 45),
                new Item("Kryptonite", 20, 20),
                new Item("Kryptonite", 0, 0),
                new Item("Kryptonite", -10, -10),


                new Item("product", 0, 0),
                new Item("product", 0, 50),
                new Item("product", 5, 45),
                new Item("product", 10, 45),
                new Item("product", 20, 20),
                new Item("product", 0, 0),
                new Item("product", -10, -10),
        };
        int[] expected = new int[] {};
        Magasin app = new Magasin(items);
        app.updateQuality();
//        assertEquals("bb", app.items[4].name);
        assertEquals("Comté", app.items[0].name);
        assertEquals("Comté", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
    }

}

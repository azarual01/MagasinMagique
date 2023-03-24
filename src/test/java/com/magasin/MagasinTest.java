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
                new Item("product", -10, -10),
        };
        int[] expected = new int[] {2,50,46,46,21,2,-8,0,0,48,47,21,0,0,0,50,45,45,20,0,-10,0,48,44,44,19,0,-10};
        Magasin app = new Magasin(items);
        app.updateQuality();
        for (int i = 0; i < items.length; i++) {
            System.out.println(app.items[i]);
            assertEquals(expected[i], app.items[i].quality);
        }
    }
}

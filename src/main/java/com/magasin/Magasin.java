package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
            for (int i = 0; i < items.length; i++){
                update(items[i]);
            }
    }

    public void update(Item item){
        switch (item.name){
            case "Comté":
                updateCompt(item);
                break;
            case "Pass VIP Concert":
                updatePassVIPConcert(item);
                break;
            case "Pouvoirs magiques":
                updatePouvoirMagiques(item);
                break;
            case "Kryptonite":
                updateKryptonite(item);
                break;
            default:
                updateProduct(item);
                break;
        }
    }
    public void updateCompt(Item item){
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if(item.sellIn <= 0){
                item.quality = item.quality + 1;
            }
        }
//        if (item.quality > 50){
//            item.quality = 50;
//        } else if (item.quality < 0) {
//            item.quality = 0;
//        }
        item.sellIn = item.sellIn - 1;
    }

    public void updatePassVIPConcert(Item item){
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }
        item.sellIn = item.sellIn - 1;
        if(item.sellIn < 0){
            item.quality = 0;
        }

//        if(item.sellIn <= 0){
//            item.quality = 0;
//        }
//        if (item.quality > 50){
//            item.quality = 50;
//        } else if (item.quality < 0) {
//            item.quality = 0;
//        }
        item.sellIn = item.sellIn - 1;
    }

    public void updateKryptonite(Item item){
//        item.quality = 80;
    }

    public void updateProduct(Item item){
        item.quality = item.quality - 1;
        item.sellIn = item.sellIn - 1;
        if(item.sellIn < 0 && item.quality > 0){
            item.quality = item.quality - 1;
        }
        if (item.quality <= 0){
            item.quality =0 ;
        }
//        if (item.quality > 50){
//            item.quality = 50;
//        } else if (item.quality < 0) {
//            item.quality = 0;
//        }
    }

    public void updatePouvoirMagiques(Item item){
        item.quality = item.quality - 2;
        item.sellIn = item.sellIn - 1;
    }

}

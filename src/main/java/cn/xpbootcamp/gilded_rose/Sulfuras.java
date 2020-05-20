package cn.xpbootcamp.gilded_rose;

public class Sulfuras extends Item {
    public static final String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";

    Sulfuras(int sell_in, int quality) {
        super(SULFURAS_NAME, sell_in, quality);
    }


    @Override
    public void updateQuality() {

    }

}

package cn.xpbootcamp.gilded_rose;

public class Sulfuras extends Item {
    Sulfuras(int sell_in, int quality) {
        super("Sulfuras, Hand of Ragnaros", sell_in, quality);
    }

    @Override
    void updateQualityWhenUnexpired() {

    }

    @Override
    void updateSellIn() {
    }

    @Override
    void updateWhenExpired() {

    }
}

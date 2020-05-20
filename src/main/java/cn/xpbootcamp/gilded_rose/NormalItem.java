package cn.xpbootcamp.gilded_rose;

public class NormalItem extends Item {
    NormalItem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    void updateQualityWhenUnexpired() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    @Override
    void updateSellIn() {
        super.updateSellIn();
    }

    @Override
    void updateWhenExpired() {
        if (sell_in < 0) {
            if (quality > 0) {
                quality = quality - 1;
            }
        }
    }
}

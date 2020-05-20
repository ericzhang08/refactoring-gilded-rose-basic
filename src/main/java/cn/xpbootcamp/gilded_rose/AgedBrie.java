package cn.xpbootcamp.gilded_rose;

public class AgedBrie extends Item {
    AgedBrie(int sell_in, int quality) {
        super("Aged Brie", sell_in, quality);
    }

    @Override
    void updateQualityWhenUnexpired() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    void updateWhenExpired() {
        if (sell_in < 0) {
            if (quality < 50) {
                quality = quality + 1;
            }

        }
    }

    @Override
    void updateSellIn() {
        sell_in = sell_in - 1;
    }
}

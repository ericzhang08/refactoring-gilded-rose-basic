package cn.xpbootcamp.gilded_rose;

public class AgedBrie extends Item {
    public static final String AGED_BRIE_NAME = "Aged Brie";

    AgedBrie(int sell_in, int quality) {
        super(AGED_BRIE_NAME, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        updateQualityWhenUnexpired();
        updateSellIn();
        updateWhenExpired();
    }

    void updateQualityWhenUnexpired() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    void updateWhenExpired() {
        if (sell_in < 0) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }

    void updateSellIn() {
        sell_in = sell_in - 1;
    }
}

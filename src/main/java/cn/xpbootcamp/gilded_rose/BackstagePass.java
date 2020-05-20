package cn.xpbootcamp.gilded_rose;

public class BackstagePass extends Item {
    public static final String BACKSTAGE_PASSES_NAME = "Backstage passes to a TAFKAL80ETC concert";

    BackstagePass(int sell_in, int quality) {
        super(BACKSTAGE_PASSES_NAME, sell_in, quality);
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
            if (sell_in < 11) {
                quality = quality + 1;
            }
            if (sell_in < 6) {
                quality = quality + 1;
            }
            if (quality > 50) {
                quality = 50;
            }
        }
    }

    void updateWhenExpired() {
        if (sell_in < 0) {
            quality = 0;
        }
    }

    void updateSellIn() {
        sell_in = sell_in - 1;
    }
}

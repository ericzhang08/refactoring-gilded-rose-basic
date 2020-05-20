package cn.xpbootcamp.gilded_rose;

public class NormalItem extends Item {
    NormalItem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        updateQualityWhenUnexpired();
        updateSellIn();
        updateWhenExpired();
    }

    void updateQualityWhenUnexpired() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    void updateSellIn() {
        sell_in = sell_in - 1;
    }

    void updateWhenExpired() {
        if (sell_in < 0) {
            if (quality > 0) {
                quality = quality - 1;
            }
        }
    }

}

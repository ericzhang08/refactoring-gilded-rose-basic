package cn.xpbootcamp.gilded_rose;

public class BackstagePass extends Item {
    BackstagePass(int sell_in, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sell_in, quality);
    }

    @Override
    void updateQualityWhenUnexpired() {
        if (quality < 50) {
            quality = quality + 1;
            if (sell_in < 11) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (sell_in < 6) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

        }

    }

    @Override
    void updateWhenExpired() {
        if (sell_in < 0) {
            quality = 0;
        }
    }
}

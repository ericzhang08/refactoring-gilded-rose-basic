package cn.xpbootcamp.gilded_rose;

public class Item {

    public String name;

    public int sell_in;

    public int quality;

    Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    public static Item createItem(String name, int sell_in, int quality) {
        switch (name) {
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePass(sell_in, quality);
            case "Aged Brie":
                return new AgedBrie(sell_in, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(sell_in, quality);
            default:
                return new Item(name, sell_in, quality);
        }
    }


    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    public void updateQuality() {
        updateQualityWhenUnexpired();

        updateSellIn();

        updateWhenExpired();
    }

    private boolean isAgedBrie() {
        return name.equals("Aged Brie");
    }

    private boolean isBackstagePass() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
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
            if (!isAgedBrie()) {
                if (!isBackstagePass()) {
                    if (quality > 0) {
                        if (!isSulfuras()) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = 0;
                }
            } else {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }
}

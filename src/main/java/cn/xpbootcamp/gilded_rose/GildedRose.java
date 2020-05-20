package cn.xpbootcamp.gilded_rose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (Item item : items) {
            updateQualityWhenUnexpired(item);

            if (!item.isSulfuras()) {
                item.sell_in = item.sell_in - 1;
            }

            if (item.sell_in < 0) {
                if (!item.isAgedBrie()) {
                    if (!item.isBackstagePass()) {
                        if (item.quality > 0) {
                            if (!item.isSulfuras()) {
                                item.quality = item.quality - 1;
                            }
                        }
                    } else {
                        item.quality = 0;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }

    private void updateQualityWhenUnexpired(Item item) {
        if (item.isAgedBrie()
                || item.isBackstagePass()) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;

                        if (item.isBackstagePass()) {
                            if (item.sell_in < 11) {
                                if (item.quality < 50) {
                                    item.quality = item.quality + 1;
                                }
                            }

                            if (item.sell_in < 6) {
                                if (item.quality < 50) {
                                    item.quality = item.quality + 1;
                                }
                            }
                        }
                    }
                } else {
            if (item.quality > 0) {
                if (item.isSulfuras()) {
                } else {
                    item.quality = item.quality - 1;
                }
            }
        }
    }

}

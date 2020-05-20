package cn.xpbootcamp.gilded_rose;

public abstract  class Item {

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
            case BackstagePass.BACKSTAGE_PASSES_NAME:
                return new BackstagePass(sell_in, quality);
            case AgedBrie.AGED_BRIE_NAME:
                return new AgedBrie(sell_in, quality);
            case Sulfuras.SULFURAS_NAME:
                return new Sulfuras(sell_in, quality);
            default:
                return new NormalItem(name, sell_in, quality);
        }
    }


    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    public abstract void updateQuality() ;
}

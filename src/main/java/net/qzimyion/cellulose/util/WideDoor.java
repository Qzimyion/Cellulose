package net.qzimyion.cellulose.util;

public enum WideDoor {

    TOP_LEFT(false, true),
    TOP_RIGHT(true, true),
    BOTTOM_LEFT(false, false),
    BOTTOM_RIGHT(true, false);

    private final boolean isRight;
    private final boolean isTop;

    WideDoor(boolean isRight, boolean isTop) {
        this.isRight = isRight;
        this.isTop = isTop;
    }

    public boolean isRight() {
        return isRight;
    }

    public boolean isTop() {
        return isTop;
    }
}

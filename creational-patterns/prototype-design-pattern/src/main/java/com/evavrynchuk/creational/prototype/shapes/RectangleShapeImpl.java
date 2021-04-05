package com.evavrynchuk.creational.prototype.shapes;

public class RectangleShapeImpl extends Shape {

    public int width;
    public int height;

    public RectangleShapeImpl() {
    }

    public RectangleShapeImpl(RectangleShapeImpl target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new RectangleShapeImpl(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof RectangleShapeImpl) || !super.equals(object2)) return false;
        RectangleShapeImpl shape2 = (RectangleShapeImpl) object2;
        return shape2.width == width && shape2.height == height;
    }
}

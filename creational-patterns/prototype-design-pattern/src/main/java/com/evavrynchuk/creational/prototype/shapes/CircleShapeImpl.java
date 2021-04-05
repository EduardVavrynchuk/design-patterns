package com.evavrynchuk.creational.prototype.shapes;

public class CircleShapeImpl extends Shape {

    public int radius;

    public CircleShapeImpl() {
    }

    public CircleShapeImpl(CircleShapeImpl target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new CircleShapeImpl(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof CircleShapeImpl) || !super.equals(object2)) return false;
        CircleShapeImpl shape2 = (CircleShapeImpl) object2;
        return shape2.radius == radius;
    }
}

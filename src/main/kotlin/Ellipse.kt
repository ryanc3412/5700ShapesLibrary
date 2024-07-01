package org.example

import kotlin.math.hypot

class Ellipse(val point: Point, private var radii1: Double, private var radii2: Double) {
    fun getRadii1(): Double {
        return radii1
    }
    fun getRadii2(): Double {
        return radii2
    }
    fun setRaddi1(radii: Double) {
        this.radii1 = radii
    }
    fun setRadii2(radii: Double) {
        this.radii2 = radii
    }
    fun getArea(): Double {
        return Math.PI * radii1 * radii2
    }
//    moves by a delta along each axis
    fun moveEllipse(x: Double, y: Double) {
        point.moveX(x)
        point.moveY(y)
    }
}
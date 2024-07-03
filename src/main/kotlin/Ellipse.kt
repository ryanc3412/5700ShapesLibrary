package org.example

class Ellipse(private val point: Point, private var radii1: Double, private var radii2: Double) {
    init {
        validateRadii()
    }

    fun getArea(): Double {
        return Math.PI * radii1 * radii2
    }

//    moves by a delta along each axis
    fun moveEllipse(x: Double, y: Double) {
        point.moveX(x)
        point.moveY(y)
    }

    fun getRadii1(): Double {
        return radii1
    }

    fun getRadii2(): Double {
        return radii2
    }

    fun setRaddi1(radii: Double) {
        validateRadii()
        this.radii1 = radii
    }

    fun setRadii2(radii: Double) {
        validateRadii()
        this.radii2 = radii
    }

    fun getPointX(): Double {
        return point.getX()
    }

    fun getPointY(): Double {
        return point.getY()
    }

    private fun validateRadii() {
        if (radii1 <= 0.0 || radii2 <= 0.0) {
            throw IllegalArgumentException("Radii has to be greater than 0.")
        }
    }
}
package org.example

class Circle(private val point: Point, private var radius: Double) {
    init {
        if (radius <= 0.0) {
            throw IllegalArgumentException("Radius has to be greater than 0.")
        }
    }

    fun getArea(): Double {
        return Math.PI * radius * radius
    }

//    moves by a delta along each axis
    fun moveCircle(x: Double, y: Double) {
        point.moveX(x)
        point.moveY(y)
    }

    fun getRadius(): Double {
        return radius
    }

    fun setRadius(newRadius: Double) {
        if (newRadius <= 0.0) {
            throw IllegalArgumentException("Radius has to be greater than 0.")
        }
        this.radius = newRadius
    }

    fun getPointX(): Double {
        return point.getX()
    }

    fun getPointY(): Double {
        return point.getY()
    }
}
package org.example

class Circle(val point: Point, private var radius: Double) {
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

    fun setRadius(radii: Double) {
        this.radius = radii
    }

    fun getPointX(): Double {
        return point.getX()
    }

    fun getPointY(): Double {
        return point.getY()
    }
}
package org.example

class Rectangle(private val point1: Point, private val point2: Point) {
    init {
        if (point1.getX() == point2.getX()) {
            throw IllegalArgumentException("A rectangle cannot have a height of 0.")
        } else if (point1.getY() == point2.getY()) {
            throw IllegalArgumentException("A rectangle cannot have a width of 0.")
        }
    }

    fun getArea(): Double {
        val width: Double = Math.abs(point1.getX() - point2.getX())
        val height: Double = Math.abs(point1.getY() - point2.getY())
        val area: Double = width * height
        return area
    }

    fun moveRectangle(x: Double, y: Double) {
        point1.moveX(x)
        point2.moveX(x)
        point1.moveY(y)
        point2.moveY(y)
    }

    fun getPoint1X(): Double {
        return point1.getX()
    }

    fun getPoint1Y(): Double {
        return point1.getY()
    }

    fun getPoint2X(): Double {
        return point2.getX()
    }

    fun getPoint2Y(): Double {
        return point2.getY()
    }
}
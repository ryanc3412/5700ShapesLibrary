package org.example

class Triangle(private val point1: Point, private val point2: Point, private val point3: Point) {
    init {
        if (getArea() == 0.0) {
            throw IllegalArgumentException(
                "A triangle cannot have an area of 0 " +
                "(this occurs when all 3 points are on the same line).")
        }
    }

    fun getArea(): Double {
        return 0.5 * Math.abs(
            point1.getX() * (point2.getY() - point3.getY()) +
            point2.getX() * (point3.getY() - point1.getY()) +
            point3.getX() * (point1.getY() - point2.getY()))
    }

    fun moveTriangle(x: Double, y: Double) {
        point1.moveX(x)
        point2.moveX(x)
        point3.moveX(x)
        point1.moveY(y)
        point2.moveY(y)
        point3.moveY(y)
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

    fun getPoint3X(): Double {
        return point3.getX()
    }

    fun getPoint3Y(): Double {
        return point3.getY()
    }
}
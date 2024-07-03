package org.example

class Square(private val point1: Point, private val point2: Point) {
    init {
        if (point1.getX() == point2.getX()) {
            throw IllegalArgumentException("A square cannot have a height of 0.")
        } else if (point1.getY() == point2.getY()) {
            throw IllegalArgumentException("A square cannot have a width of 0.")
        } else if ((point2.getX() - point1.getX()) != (point2.getY() - point1.getY())) {
            throw   IllegalArgumentException("A square must have equivalent height and width.")
        }
    }

    fun getArea(): Double {
        val widthHeight: Double = Math.abs(point1.getX() - point2.getX())
        val area: Double = widthHeight * widthHeight
        return area
    }

    fun moveSquare(x: Double, y: Double) {
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
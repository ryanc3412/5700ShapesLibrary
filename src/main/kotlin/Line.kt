package org.example

import kotlin.math.sqrt
import kotlin.math.pow

class Line(private val point1: Point, private val point2: Point) {
    init {
        if (point1.equals(point2)) {
            throw IllegalArgumentException("A line cannot have 0 length.")
        }
    }

    // slope of the line between 2 points
    fun getSlope(): Double? {
        if (point1.getX() == point2.getX()) {
            return null
        }
        // either point1 or point2 can be less than the other,
        // changing the starting point of the slope
        val slope = if (point1.getX() < point2.getX()) {
            (point2.getY() - point1.getY()) / (point2.getX() - point1.getX())
        } else {
            (point1.getY() - point2.getY()) / (point1.getX() - point2.getX())
        }
        return slope
    }

    // length of the line between 2 points
    fun getLength(): Double {
        val dx = Math.abs(point2.getX() - point1.getX())
        val dy = Math.abs(point2.getY() - point1.getY())
        return sqrt(dx.pow(2) + dy.pow(2))
    }

    // move whole line by delta in each axis
    fun moveLine(x: Double, y: Double) {
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
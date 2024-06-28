package org.example

class Square(val point1: Point, val point2: Point) {
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
}
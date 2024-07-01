package org.example

class Triangle(val point1: Point, val point2: Point ,val point3: Point) {
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
}
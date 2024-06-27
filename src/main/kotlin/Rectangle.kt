package org.example

class Rectangle(val point1: Point, val point2: Point) {
    fun getArea(): Double {
        val width: Double = Math.abs(point1.getX() - point2.getX())
        val height: Double = Math.abs(point1.getY() - point2.getY())
        val area: Double = width * height
        return area
    }
}
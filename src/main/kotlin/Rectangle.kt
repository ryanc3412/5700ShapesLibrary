package org.example

class Rectangle(val corner1: Point, val corner2: Point) {
    fun getArea(): Double {
        val width: Double = Math.abs(corner1.getX() - corner2.getX())
        val height: Double = Math.abs(corner1.getY() - corner2.getY())
        val area: Double = width * height
        return area
    }
}
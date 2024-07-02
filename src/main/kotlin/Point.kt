package org.example

class Point(private var x: Double, private var y: Double) {
    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun moveX(x: Double) {
        this.x += x
    }

    fun moveY(y: Double) {
        this.y += y
    }

    fun clone(): Point {
        return Point(x, y)
    }
    fun equals(point: Point): Boolean {
        return (this.x == point.getX() && this.y == point.getY())
    }
}
package org.example

class Point(private var x: Double, private var y: Double) {
    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun setX(x: Double) {
        this.x = x
    }

    fun setY(y: Double) {
        this.y = y
    }
}
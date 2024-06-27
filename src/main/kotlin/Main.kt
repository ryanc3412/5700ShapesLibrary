package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val p1 = Point(0.0, 0.0)
    val p2 = Point(2.0, 2.0)

    val rec = Rectangle(p1, p2)
    rec.corner1.setY(10.0)
    println(rec.corner1.getY())
}
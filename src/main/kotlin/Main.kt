package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    point
    val p1 = Point(0.0, 7.0)
    val p2 = p1.clone()

//    println(p2.getX())
//    println(p2.getY())

    p2.moveX(1.0)
    p2.moveY(1.0)

//    println(p2.getX())
//    println(p2.getY())

//    line
    val lp1 = Point(0.0, 0.0)
    val lp2 = Point(4.0, 2.0)
    val l = Line(lp1, lp2)
//    println(l.getSlope())
//    println(l.getLength())
    l.moveLine(1.0,1.0)
}
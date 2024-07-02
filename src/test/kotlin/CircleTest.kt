import org.example.Circle
import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class CircleTest {
    @Test
    fun testGetArea() {
        val point = Point(0.0, 0.0)
        val radii1 = 5.0
        val radii2 = 5.0
        val circle = Circle(point, radii1, radii2)
        assertEquals(78.53981633974483, circle.getArea())
    }
    @Test
    fun testMoveCircle() {
        val point = Point(0.0, 3.0)
        val radii1 = 5.0
        val radii2 = 5.0
        val circle = Circle(point, radii1, radii2)
        circle.moveCircle(10.0, 10.0)
        assertEquals(10.0, circle.getPointX())
        assertEquals(13.0, circle.getPointY())
    }
    @Test
    fun testGetRadiis() {
        val point = Point(-5.0, -5.0)
        val radii1 = 2.0
        val radii2 = 2.0
        val circle = Circle(point, radii1, radii2)
        assertEquals(2.0, circle.getRadii1())
        assertEquals(2.0, circle.getRadii2())
    }
    @Test
    fun testSetRadiis() {
        val point = Point(0.0, 0.0)
        val radii1 = 10.0
        val radii2 = 10.0
        val circle = Circle(point, radii1, radii2)
        circle.setRaddi1(5.0)
        circle.setRadii2(5.0)
        assertEquals(5.0, circle.getRadii1())
        assertEquals(5.0, circle.getRadii2())
    }
    @Test
    fun testGetPoints() {
        val point = Point(0.0, 5.0)
        val radii1 = 10.0
        val radii2 = 10.0
        val circle = Circle(point, radii1, radii2)
        assertEquals(0.0, circle.getPointX())
        assertEquals(5.0, circle.getPointY())
    }
}
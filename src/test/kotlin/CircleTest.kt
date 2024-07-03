import org.example.Circle
import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CircleTest {
    @Test
    fun testGetArea() {
        val point = Point(0.0, 0.0)
        val radius = 5.0
        val circle = Circle(point, radius)
        assertEquals(78.53981633974483, circle.getArea())
    }
    @Test
    fun testMoveCircle() {
        val point = Point(0.0, 3.0)
        val radius = 5.0
        val circle = Circle(point, radius)
        circle.moveCircle(10.0, 10.0)
        assertEquals(10.0, circle.getPointX())
        assertEquals(13.0, circle.getPointY())
    }
    @Test
    fun testGetRadiis() {
        val point = Point(-5.0, -5.0)
        val radius = 2.0
        val circle = Circle(point, radius)
        assertEquals(2.0, circle.getRadius())
    }
    @Test
    fun testSetRadiis() {
        val point = Point(0.0, 0.0)
        val radius = 10.0
        val circle = Circle(point, radius)
        circle.setRadius(5.0)
        assertEquals(5.0, circle.getRadius())
    }
    @Test
    fun testGetPoints() {
        val point = Point(0.0, 5.0)
        val radius = 10.0
        val circle = Circle(point, radius)
        assertEquals(0.0, circle.getPointX())
        assertEquals(5.0, circle.getPointY())
    }
    @Test
    fun testNegativeRadius() {
        val point = Point(0.0, 5.0)
        val radius = -2.0
        assertFailsWith<IllegalArgumentException> {
            Circle(point, radius)
        }
    }
    @Test
    fun testZeroRadius() {
        val point = Point(0.0, 5.0)
        val radius = 0.0
        assertFailsWith<IllegalArgumentException> {
            Circle(point, radius)
        }
    }
}
import org.example.Rectangle
import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class RectangleTest {
    @Test
    fun testGetArea() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(6.0, 4.0)
        val rectangle = Rectangle(point1, point2)
        assertEquals(24.0, rectangle.getArea())
    }
    @Test
    fun testMoveRectangle() {
        val point1 = Point(0.0, 1.0)
        val point2 = Point(6.0, 3.0)
        val rectangle = Rectangle(point1, point2)
        rectangle.moveRectangle(2.0, 2.0)
        assertEquals(2.0, rectangle.getPoint1X())
        assertEquals(3.0, rectangle.getPoint1Y())
        assertEquals(8.0, rectangle.getPoint2X())
        assertEquals(5.0, rectangle.getPoint2Y())
    }
    @Test
    fun testGetPoints() {
        val point1 = Point(-4.0, -5.0)
        val point2 = Point(-1.0, 7.0)
        val rectangle = Rectangle(point1, point2)
        assertEquals(-4.0, rectangle.getPoint1X())
        assertEquals(-5.0, rectangle.getPoint1Y())
        assertEquals(-1.0, rectangle.getPoint2X())
        assertEquals(7.0, rectangle.getPoint2Y())
    }
}
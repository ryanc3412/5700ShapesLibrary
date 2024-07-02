import org.example.Square
import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class SquareTest {
    @Test
    fun testGetArea() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(4.0, 4.0)
        val square = Square(point1, point2)
        assertEquals(16.0, square.getArea())
    }
    @Test
    fun testmoveSquare() {
        val point1 = Point(-5.0, -6.0)
        val point2 = Point(-8.0, -9.0)
        val square = Square(point1, point2)
        square.moveSquare(10.0, -10.0)
        assertEquals(5.0, square.getPoint1X())
        assertEquals(-16.0, square.getPoint1Y())
        assertEquals(2.0, square.getPoint2X())
        assertEquals(-19.0, square.getPoint2Y())
    }
    @Test
    fun testGetPoints() {
        val point1 = Point(4.0, 5.0)
        val point2 = Point(10.0, 11.0)
        val square = Square(point1, point2)
        assertEquals(4.0, square.getPoint1X())
        assertEquals(5.0, square.getPoint1Y())
        assertEquals(10.0, square.getPoint2X())
        assertEquals(11.0, square.getPoint2Y())
    }
}
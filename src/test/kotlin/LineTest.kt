import org.example.Line
import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class LineTest {
    @Test
    fun testGetSlope() {
        val point1 = Point(-1.0, -1.0)
        val point2 = Point(2.0, 2.0)
        val line = Line(point1, point2)
        assertEquals(1.0, line.getSlope())
    }
    @Test
    fun testGetSlopeNull() {
        val point1 = Point(25.7896, 0.0)
        val point2 = Point(25.7896, 20.00000548)
        val line = Line(point1, point2)
        assertEquals(null, line.getSlope())
    }
    @Test
    fun testGetLength1() {
        val point1 = Point(3.0, 4.0)
        val point2 = Point(0.0, 0.0)
        val line = Line(point1, point2)
        assertEquals(5.0, line.getLength())
    }
    @Test
    fun testGetLength2() {
        val point1 = Point(-4.0, -5.0)
        val point2 = Point(-1.0, -1.0)
        val line = Line(point1, point2)
        assertEquals(5.0, line.getLength())
    }
    @Test
    fun testMoveLine() {
        val point1 = Point(0.0, 1.0)
        val point2 = Point(5.0, 9.0)
        val line = Line(point1, point2)
        line.moveLine(2.0, 2.0)
        assertEquals(2.0, line.getPoint1X())
        assertEquals(3.0, line.getPoint1Y())
        assertEquals(7.0, line.getPoint2X())
        assertEquals(11.0, line.getPoint2Y())
    }
    @Test
    fun testGetPoints() {
        val point1 = Point(12.0, 1.0)
        val point2 = Point(5.0, 9.99)
        val line = Line(point1, point2)
        assertEquals(12.0, line.getPoint1X())
        assertEquals(1.0, line.getPoint1Y())
        assertEquals(5.0, line.getPoint2X())
        assertEquals(9.99, line.getPoint2Y())
    }
}
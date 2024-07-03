import org.example.Point
import org.example.Triangle
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class TriangleTest {
    @Test
    fun testGetArea() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(2.0, 2.0)
        val point3 = Point(0.0, 5.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(5.0, triangle.getArea())
    }
    @Test
    fun testMoveTriangle() {
        val point1 = Point(0.0, 0.0)
        val point2 = Point(2.0, 2.0)
        val point3 = Point(0.0, 5.0)
        val triangle = Triangle(point1, point2, point3)
        triangle.moveTriangle(3.0, 3.0)
        assertEquals(3.0, triangle.getPoint1X())
        assertEquals(3.0, triangle.getPoint1Y())
        assertEquals(5.0, triangle.getPoint2X())
        assertEquals(5.0, triangle.getPoint2Y())
        assertEquals(3.0, triangle.getPoint3X())
        assertEquals(8.0, triangle.getPoint3Y())
    }
    @Test
    fun testGetPoint1() {
        val point1 = Point(0.0, 1.0)
        val point2 = Point(7.0, 2.0)
        val point3 = Point(12.0, 5.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(0.0, triangle.getPoint1X())
        assertEquals(1.0, triangle.getPoint1Y())
    }
    @Test
    fun testGetPoint2() {
        val point1 = Point(0.0, 1.0)
        val point2 = Point(7.0, 2.0)
        val point3 = Point(12.0, 5.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(7.0, triangle.getPoint2X())
        assertEquals(2.0, triangle.getPoint2Y())
    }
    @Test
    fun testGetPoint3() {
        val point1 = Point(0.0, 1.0)
        val point2 = Point(7.0, 2.0)
        val point3 = Point(12.0, 5.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(12.0, triangle.getPoint3X())
        assertEquals(5.0, triangle.getPoint3Y())
    }
    @Test
    fun testInvalidTriangle() {
        val point1 = Point(1.0, 1.0)
        val point2 = Point(7.0, 7.0)
        val point3 = Point(12.0, 12.0)
        assertFailsWith<IllegalArgumentException> {
            Triangle(point1, point2, point3)
        }
    }
}
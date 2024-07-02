import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals


class PointTest {
    @Test
    fun testGetX() {
        val point = Point(5.864, 10.789615)
        assertEquals(5.864, point.getX())
    }
    @Test
    fun testGetY() {
        val point = Point(5.864, 10.789615)
        assertEquals(10.789615, point.getY())
    }
    @Test
    fun testMoveX() {
        val point = Point(4.5, 0.0)
        point.moveX(4.5)
        assertEquals(9.0, point.getX())
    }
    @Test
    fun testMoveY() {
        val point = Point(4.5, 0.0)
        point.moveY(-3.5)
        assertEquals(-3.5, point.getY())
    }
    @Test
    fun testClone() {
        val point1 = Point(5158.5464, 24.658)
        val point2 = point1.clone()
        assertEquals(true, (point1.equals(point2)))
    }
    @Test
    fun testEqualsTrue() {
        val point1 = Point(548.888, 0.000001)
        val point2 = Point(548.888, 0.000001)
        assertEquals(true, point1.equals(point2))
    }
    @Test
    fun testEqualsFalse() {
        val point1 = Point(963.147852369, 0.0)
        val point2 = Point(963.147852368, 0.0)
        assertEquals(false, point1.equals(point2))
    }
}
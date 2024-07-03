import org.example.Ellipse
import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Ellipse {
    @Test
    fun testGetArea() {
        val point = Point(0.0, 0.0)
        val radii1 = 5.0
        val radii2 = 10.0
        val ellipse = Ellipse(point, radii1, radii2)
        assertEquals(157.07963267948966, ellipse.getArea())
    }
    @Test
    fun testMoveEllipse() {
        val point = Point(10.0, -10.0)
        val radii1 = 3.0
        val radii2 = 2.0
        val ellipse = Ellipse(point, radii1, radii2)
        ellipse.moveEllipse(-5.0, -5.0)
        assertEquals(5.0, ellipse.getPointX())
        assertEquals(-15.0, ellipse.getPointY())
    }
    @Test
    fun testGetRadiis() {
        val point = Point(0.0, 0.0)
        val radii1 = 5.0
        val radii2 = 10.0
        val ellipse = Ellipse(point, radii1, radii2)
        assertEquals(5.0, ellipse.getRadii1())
        assertEquals(10.0, ellipse.getRadii2())
    }
    @Test
    fun testSetRaddis() {
        val point = Point(0.0, 0.0)
        val radii1 = 5.0
        val radii2 = 10.0
        val ellipse = Ellipse(point, radii1, radii2)
        ellipse.setRaddi1(7.5)
        ellipse.setRadii2(10.2525)
        assertEquals(7.5, ellipse.getRadii1())
        assertEquals(10.2525, ellipse.getRadii2())
    }
    @Test
    fun testGetPoints() {
        val point = Point(8.0, 25.0000001)
        val radii1 = 5.0
        val radii2 = 10.0
        val ellipse = Ellipse(point, radii1, radii2)
        assertEquals(8.0, ellipse.getPointX())
        assertEquals(25.0000001, ellipse.getPointY())
    }
    @Test
    fun testNegativeRadii() {
        val point = Point(0.0, 0.0)
        val radii1 = -5.0
        val radii2 = 10.0
        assertFailsWith<IllegalArgumentException> {
            Ellipse(point, radii1, radii2)
        }
    }
    @Test
    fun testZeroRadii() {
        val point = Point(0.0, 0.0)
        val radii1 = 5.0
        val radii2 = 0.0
        assertFailsWith<IllegalArgumentException> {
            Ellipse(point, radii1, radii2)
        }
    }
}
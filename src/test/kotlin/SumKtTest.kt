import org.junit.Test
import kotlin.test.assertEquals

class SumKtTest{
    @Test
    fun shouldRetun4() = assertEquals(4.0, sum(2.0, 2.0))

    @Test
    fun shouldRetun5() = assertEquals(5, sum(2, 3))

    @Test
    fun shouldRetun6() = assertEquals(6.0, sum(2, 4.0))

    @Test
    fun shouldRetun7() = assertEquals(7.0, sum(4.0, 3))
}
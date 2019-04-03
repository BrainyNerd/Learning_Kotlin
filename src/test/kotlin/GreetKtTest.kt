import org.junit.Assert.*
import org.junit.Test

class GreetKtTest{
    @Test
    fun shouldGreetHelloWorld() {
        assertEquals("Hello World!", greet());
    }
}
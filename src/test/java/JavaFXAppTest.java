import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }
    @Test
    void keerFunctieTest() {
        JavaFXApp test = new JavaFXApp();
        assertEquals(6, test.computeMultiply(2,3));
    }
}
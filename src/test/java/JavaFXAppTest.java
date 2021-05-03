import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {

    @Test
    void computeDivide() {
        JavaFXApp test1 = new JavaFXApp();
        assertEquals(2,test1.computeDivide(4,2));
    }
}
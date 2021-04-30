import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    JavaFXApp java = new JavaFXApp();
    @Test
    void aDummyTest() {
        assertEquals(1+1,java.computeAdd(1,1));

    @Test
    void computeDivide() {
        JavaFXApp test1 = new JavaFXApp();
        assertEquals(0,test1.computeDivide(2,0));
    }
}
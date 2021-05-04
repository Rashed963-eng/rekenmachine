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
        assertEquals(2,test1.computeDivide(4,2));
    }
    @Test
    void keerFunctieTest() {
        JavaFXApp test = new JavaFXApp();
        assertEquals(6, test.computeMultiply(2,3));
    }
}
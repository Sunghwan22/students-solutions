import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
  @Test
  void simpleTest() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();

    assertEquals(0,spiralMatrix.transformSpiral(1));
    assertEquals(1,spiralMatrix.transformSpiral(2));
    assertEquals(2,spiralMatrix.transformSpiral(3));
    assertEquals(3,spiralMatrix.transformSpiral(4));
  }

}
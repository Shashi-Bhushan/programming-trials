package in.shabhushan.algo_trials.dynamic_programming;

import in.shabhushan.algo_trials.dynamic_programming.matric_chain.MatrixChainMultiplicationOOP;
import org.junit.Test;

import static in.shabhushan.algo_trials.dynamic_programming.MatrixChainMultiplication.mcm;
import static org.junit.Assert.assertEquals;

public class MatrixChainMultiplicationTest {
  @Test
  public void testMcm() {
    assertEquals(0, mcm(new int[]{10, 15}));
    assertEquals(3000, mcm(new int[]{10, 15, 20}));
    assertEquals(8000, mcm(new int[]{10, 15, 20, 25}));
    assertEquals(210060, mcm(new int[]{10, 15, 20, 25, 112, 56, 78, 34, 121}));
  }

  @Test
  public void testOOPMcm() {
    assertEquals(0, MatrixChainMultiplicationOOP.mcm(new int[]{10, 15}));
    assertEquals(3000, MatrixChainMultiplicationOOP.mcm(new int[]{10, 15, 20}));
    assertEquals(8000, MatrixChainMultiplicationOOP.mcm(new int[]{10, 15, 20, 25}));
    assertEquals(210060, MatrixChainMultiplicationOOP.mcm(new int[]{10, 15, 20, 25, 112, 56, 78, 34, 121}));
  }

  @Test
  public void testOOPMcmDp() {
    assertEquals(0, MatrixChainMultiplicationOOP.mcmDP(new int[]{10, 15}));
    assertEquals(3000, MatrixChainMultiplicationOOP.mcmDP(new int[]{10, 15, 20}));
    assertEquals(8000, MatrixChainMultiplicationOOP.mcmDP(new int[]{10, 15, 20, 25}));
    assertEquals(210060, MatrixChainMultiplicationOOP.mcmDP(new int[]{10, 15, 20, 25, 112, 56, 78, 34, 121}));
  }
}

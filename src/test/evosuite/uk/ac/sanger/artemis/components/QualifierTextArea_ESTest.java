/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 21:19:48 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.QualifierTextArea;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class QualifierTextArea_ESTest extends QualifierTextArea_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = QualifierTextArea.getEndOfLink("/GO=\"aspect=function; ", 0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = QualifierTextArea.getEndOfLink("q>o\"'=N", (-594));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = QualifierTextArea.getEndOfLink("", 8808);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        QualifierTextArea.getEndOfLink((String) null, (-550));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.QualifierTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QualifierTextArea.handleMouseSingleClick((String) null, (JComponent) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField();
      assertFalse(jPasswordField0.getIgnoreRepaint());
      assertTrue(jPasswordField0.getFocusTraversalKeysEnabled());
      assertFalse(jPasswordField0.isFocusTraversalPolicySet());
      assertFalse(jPasswordField0.isFocusTraversalPolicyProvider());
      assertFalse(jPasswordField0.isFocusCycleRoot());
      assertNotNull(jPasswordField0);
      
      // Undeclared exception!
      try { 
        QualifierTextArea.handleMouseSingleClick("]", jPasswordField0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.QualifierTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = QualifierTextArea.getEndOfLink(",veyA~_'HB{>)A6f[]<", (-175));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      QualifierTextArea qualifierTextArea0 = null;
      try {
        qualifierTextArea0 = new QualifierTextArea();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.text.JTextComponent", e);
      }
  }
}
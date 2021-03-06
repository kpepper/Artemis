/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 22:01:04 GMT 2018
 */

package uk.ac.sanger.artemis.circular.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.digest.CutSite;
import uk.ac.sanger.artemis.circular.digest.EmbossTableParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EmbossTableParser_ESTest extends EmbossTableParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      List<CutSite> list0 = embossTableParser0.list;
      embossTableParser0.list = list0;
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader0).readLine();
      embossTableParser0.parse(bufferedReader0);
      String string0 = "_p!)[D!poj ";
      BufferedReader bufferedReader1 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn("_p!)[D!poj ", (String) null, (String) null, (String) null, (String) null).when(bufferedReader1).readLine();
      // Undeclared exception!
      embossTableParser0.parse(bufferedReader1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn("'4+((},}W(^", (String) null).when(bufferedReader0).readLine();
      List<CutSite> list0 = embossTableParser0.parse(bufferedReader0);
      embossTableParser0.list = list0;
      EmbossTableParser embossTableParser1 = new EmbossTableParser();
      BufferedReader bufferedReader1 = null;
      embossTableParser0.list = list0;
      // Undeclared exception!
      try { 
        embossTableParser1.parse(bufferedReader1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.digest.EmbossTableParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      String string0 = "";
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null, (String) null, (String) null, (String) null).when(bufferedReader0).readLine();
      // Undeclared exception!
      embossTableParser0.parse(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      // Undeclared exception!
      try { 
        embossTableParser0.parse((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.digest.EmbossTableParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      EmbossTableParser embossTableParser1 = new EmbossTableParser();
      String string0 = "#'";
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn("#'", "#'", "s+", "s+", "#'").when(bufferedReader0).readLine();
      // Undeclared exception!
      embossTableParser0.parse(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader0).readLine();
      List<CutSite> list0 = embossTableParser0.parse(bufferedReader0);
      BufferedReader bufferedReader1 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader1).readLine();
      embossTableParser0.parse(bufferedReader1);
      BufferedReader bufferedReader2 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader2).readLine();
      List<CutSite> list1 = embossTableParser0.parse(bufferedReader2);
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader0).readLine();
      EmbossTableParser embossTableParser1 = new EmbossTableParser();
      BufferedReader bufferedReader1 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader1).readLine();
      embossTableParser0.parse(bufferedReader1);
      BufferedReader bufferedReader2 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader2).readLine();
      embossTableParser1.parse(bufferedReader2);
      List<CutSite> list0 = embossTableParser1.list;
      embossTableParser0.list = list0;
      embossTableParser0.parse(bufferedReader0);
      BufferedReader bufferedReader3 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader3).readLine();
      embossTableParser0.parse(bufferedReader3);
      BufferedReader bufferedReader4 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader4).readLine();
      List<CutSite> list1 = embossTableParser0.parse(bufferedReader4);
      embossTableParser0.list = list0;
      BufferedReader bufferedReader5 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader5).readLine();
      embossTableParser0.parse(bufferedReader5);
      BufferedReader bufferedReader6 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader6).readLine();
      embossTableParser1.parse(bufferedReader6);
      embossTableParser1.getLength();
      BufferedReader bufferedReader7 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader7).readLine();
      embossTableParser0.parse(bufferedReader7);
      embossTableParser0.getLength();
      embossTableParser1.getLength();
      embossTableParser1.list = list1;
      BufferedReader bufferedReader8 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader8).readLine();
      embossTableParser0.parse(bufferedReader8);
      embossTableParser0.getLength();
      embossTableParser1.getLength();
      embossTableParser1.getLength();
      embossTableParser1.getLength();
      embossTableParser0.getLength();
      int int0 = embossTableParser1.getLength();
      assertEquals(0, int0);
      
      BufferedReader bufferedReader9 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader9).readLine();
      embossTableParser0.parse(bufferedReader9);
      assertEquals(0, embossTableParser0.getLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      EmbossTableParser embossTableParser1 = new EmbossTableParser();
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader0).readLine();
      List<CutSite> list0 = embossTableParser1.parse(bufferedReader0);
      embossTableParser0.list = list0;
      BufferedReader bufferedReader1 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader1).readLine();
      List<CutSite> list1 = embossTableParser0.parse(bufferedReader1);
      assertEquals(0, list1.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader0).readLine();
      embossTableParser0.parse(bufferedReader0);
      embossTableParser0.getLength();
      embossTableParser0.getLength();
      embossTableParser0.getLength();
      int int0 = embossTableParser0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      int int0 = embossTableParser0.getLength();
      assertEquals(0, int0);
      
      embossTableParser0.list = null;
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader0).readLine();
      embossTableParser0.parse(bufferedReader0);
      BufferedReader bufferedReader1 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader1).readLine();
      embossTableParser0.parse(bufferedReader1);
      assertEquals(0, embossTableParser0.getLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      BufferedReader bufferedReader1 = null;
      // Undeclared exception!
      try { 
        embossTableParser0.parse((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.digest.EmbossTableParser", e);
      }
  }
}

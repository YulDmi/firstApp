package com.max;

import com.max.client.firstAppTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class firstAppSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for firstApp");
    suite.addTestSuite(firstAppTest.class);
    return suite;
  }
}

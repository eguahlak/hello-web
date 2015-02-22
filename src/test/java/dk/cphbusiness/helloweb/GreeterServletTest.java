package dk.cphbusiness.helloweb;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;



public class GreeterServletTest {
  
  @Before
  public void setup() throws Exception {
    setBaseUrl("http://localhost:8080/HelloWeb");
    }
  
  @Test
  public void testInitalCall() {
    beginAt("/Greeter");
    assertTitleEquals("Hello Web");
    }
  
  }

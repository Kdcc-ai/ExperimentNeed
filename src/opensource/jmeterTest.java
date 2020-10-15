package opensource;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

public class jmeterTest extends TestCase {
    public static jmeter Jmeter=new jmeter("lyd","zmy");
	protected void setUp() throws Exception {
		
	}
	public void testGetName() {
		assertEquals("lyd",Jmeter.getName());
	}
	public void testGetFriend() {
		assertEquals("zmy",Jmeter.getFriend());
	}

}

import junit.framework.TestCase;


public class MergeTwoStringTest extends TestCase {

	protected static void setUpBeforeClass() throws Exception {}

	protected static void tearDownAfterClass() throws Exception {}

	protected void setUp() throws Exception {
			super.setUp();
		}

	protected void tearDown() throws Exception {
			super.tearDown();
		}

	public void testMerge(){
		assertEquals("adefhino",MergeTwoString.merge("nihao","addef"));
	}
}

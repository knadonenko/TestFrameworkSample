import org.junit.*;

public class JUnitTestSample {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Simple before test");
    }

    @Test
    public void someTest() {
        System.out.println("Testing something");
    }

    @Test
//    @Ignore
    public void someTestSecond() {
        System.out.println("Testing something second");
    }

    @After
    public void afterTest() {
        System.out.println("Simple after test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

}

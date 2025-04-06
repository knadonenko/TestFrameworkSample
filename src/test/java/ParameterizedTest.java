import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    @Parameterized.Parameter
    public String testString;

    @Parameterized.Parameters
    public static Collection<String> data(){
        return Arrays.asList(
                "String 123",
                "String 324"
        );
    }

    @Test
    public void parameterizedTest() {
        System.out.println(testString);
    }

}

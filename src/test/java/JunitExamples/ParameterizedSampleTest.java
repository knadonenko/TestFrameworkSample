package JunitExamples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedSampleTest {

    @ParameterizedTest
    @ValueSource(strings = {"jgg", "777"})
    public void parameterizedTest(String string) {
        System.out.println(string);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @MethodSource("data")
    public void parameterizedTest2(int a, int b, int result) {
        assertEquals(a + b, result);
    }

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(4, 8, 12),
                Arguments.of(3, 5, 9)
        );
    }
}

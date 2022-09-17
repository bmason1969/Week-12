import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;

import org.assertj.core.api.AbstractAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class TestDemoTest {

	private TestDemo testDemo;
	
	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}
	

	@ParameterizedTest
	@MethodSource("TestDemoTest#argumentsForAddPositive#")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected,
		boolean expectException){
	
		
		
		if (!expectException) {
			assertThatThrownBy(() -> 
    testDemo.addPositive(a, b))
        .isInstanceOf(IllegalArgumentException.class);
		}
			
		
		else {
			int actual = testDemo.addPositive(a, b);
		assertThat(actual).isEqualTo(expected);
	}	
}
	@Test 
	
	void assertThatNumberSquaredIsCorrect () {
	int expected = 25;
	int a = 5;
	
	
	
	TestDemo mockDemo = spy(testDemo);
	doReturn(5).when(mockDemo).getRandomInt();
	int actual =mockDemo.randomNumberSquared();
	assertThat(actual).isEqualTo(expected);
}
	 


	static Stream<Arguments> argumentsForAddPositive() {
		//@formatter: off
		
	return Stream.of(
		arguments(5, 5, 25, true),
		arguments (5, 1, 6, true),
		arguments(23,0, 23, true),
		arguments(-4, 2, -6, false)
		);

	//@formatter: on
	}	

}
	


	
		
	
	
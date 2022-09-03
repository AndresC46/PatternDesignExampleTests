import StructuralPatterns.FlyweightPattern.Circle;
import StructuralPatterns.FlyweightPattern.ShapeFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created
 * and to decrease memory footprint and increase performance.
 * This type of design pattern comes under structural pattern as this pattern
 * provides ways to decrease object count thus improving the object structure of application.
 */
public class Structural_FlyweightPatternUT {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    private String randomColor;

    @Test
    public void givenCircle_whenSetColorRandom_thenDrawWithValidColor(){
        for (int i=0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(10);
            circle.setY(10);
            circle.setRadius(100);
            circle.draw();
            assertTrue(Arrays.stream(colors).anyMatch(circle.color()::equals));
        }

    }

    /**
     * Generate Random Color
     * @return
     */
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

} // end class

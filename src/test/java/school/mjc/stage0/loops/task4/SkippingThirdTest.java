package school.mjc.stage0.loops.task4;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class SkippingThirdTest extends BaseIOTest {

    @Test
    void printUntilButThirdUntilSeven() {
        SkippingThird skippingThird = new SkippingThird();

        skippingThird.printUntilButThird(7);

        assertOutEquals("1\n2\n4\n5\n6\n7\n");
    }

    @Test
    void printUntilButThirdZero() {
        SkippingThird skippingThird = new SkippingThird();

        skippingThird.printUntilButThird(0);

        assertOutEquals("");
    }

    @Test
    void printUntilButThirdNegative() {
        SkippingThird skippingThird = new SkippingThird();

        skippingThird.printUntilButThird(-10);

        assertOutEquals("");
    }
}
package support;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

public class MatcherTest {
    @Test
    public void
    canUseHamcrestCustomMatcher() {
        boolean actual = true;

        try {
            assertThat(actual, matchesBoolean(false));
        }
        catch (AssertionError assertionError) {
        }
        catch (NoSuchMethodError noSuchMethodError) {
            fail("Should be able to use a custom matcher, make sure no other library includes hamcrest.");
        }
    }

    private static Matcher<Boolean> matchesBoolean(final boolean expected) {
        return new TypeSafeMatcher<Boolean>() {
            @Override
            protected boolean matchesSafely(final Boolean aBoolean) {
                return aBoolean == expected;
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText("a boolean with value ").appendValue(expected);
            }

            @Override
            protected void describeMismatchSafely(final Boolean item, final Description mismatchDescription) {
                mismatchDescription.appendText("a boolean with value ").appendValue(item);
            }
        };
    }

}

package support;

import com.objogate.wl.Query;
import com.objogate.wl.swing.driver.JButtonDriver;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import javax.swing.*;

import static org.hamcrest.CoreMatchers.equalTo;

public class JButtonWithIconDriver extends JButtonDriver {

    public JButtonWithIconDriver(com.objogate.wl.swing.driver.ComponentDriver<? extends java.awt.Component> parentOrOwner,
                                 Class<JButton> componentType,
                                 org.hamcrest.Matcher<? super JButton>... matchers) {
        super( parentOrOwner, componentType, matchers);
    }

    public void hasIcon(Matcher<String> matcher) {
        has( icon(), matcher );
    }

    private Query<JButton, String> icon() {

        return new Query<JButton, String>() {

            public String query(JButton button) {
                return button.getIcon() != null ? button.getIcon().toString() : null;
            }

            public void describeTo(Description description) {
                description.appendText("icon");
            }
        };
    }

    public void hasNoIcon() {
        has(icon(), equalTo( null ));
    }
}

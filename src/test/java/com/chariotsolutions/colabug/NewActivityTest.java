package com.chariotsolutions.colabug;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import support.ProjectTestRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static support.ProjectTestRunner.assertViewIsVisible;

@RunWith(ProjectTestRunner.class)

public class NewActivityTest {

    private TestNewActivity activity;
    private View button;

    @Before
    public void setUp() throws Exception {
        activity = new TestNewActivity();
        activity.onCreate(null);

        button = activity.findViewById(R.id.crazy_button);
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void shouldHaveButton() throws Exception {
        assertViewIsVisible(button);
    }

    @Test
    public void buttonShouldDoSomethingCrazy() throws Exception {
        button.performClick();
        assertTrue(activity.conditionWasMet);
    }

    class TestNewActivity extends NewActivity {
        protected boolean conditionWasMet = false;

        @Override
        protected void doSomethingCrazy() {
            conditionWasMet = true;
        }
    }
}

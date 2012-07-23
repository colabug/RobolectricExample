package com.chariotsolutions.colabug;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import support.ProjectTestRunner;

import static org.junit.Assert.assertNotNull;
import static support.ProjectTestRunner.assertViewIsVisible;

@RunWith(ProjectTestRunner.class)

public class MyActivityTest {

    private MyActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = new MyActivity();
        activity.onCreate(null);
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void shouldHaveWelcomeText() throws Exception {
        assertViewIsVisible(activity.findViewById(R.id.welcome_text_view));
    }
}

package com.chariotsolutions.colabug;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import support.ProjectTestRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static support.ProjectTestRunner.assertViewIsVisible;
import static support.ProjectTestRunner.getResourceString;

@RunWith(ProjectTestRunner.class)

public class MyActivityTest {

    private MyActivity activity;
    private TextView welcomeText;

    @Before
    public void setUp() throws Exception {
        activity = new MyActivity();
        activity.onCreate(null);

        welcomeText = (TextView) activity.findViewById(R.id.welcome_text_view);
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void shouldHaveWelcomeText() throws Exception {
        assertViewIsVisible(welcomeText);
    }

    @Test
    public void welcomeTextShouldEqualResource() throws Exception {
        assertThat(welcomeText.getText().toString(),
                   equalTo(getResourceString(R.string.WELCOME_STRING)));
    }
}

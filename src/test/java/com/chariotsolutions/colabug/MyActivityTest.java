package com.chariotsolutions.colabug;

import android.view.View;

import com.xtremelabs.robolectric.RobolectricTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)

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
        assertThat(activity.findViewById(R.id.welcome_text_view).getVisibility(),
                   equalTo(View.VISIBLE));
    }
}

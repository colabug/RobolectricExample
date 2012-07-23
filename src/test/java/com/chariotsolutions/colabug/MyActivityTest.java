package com.chariotsolutions.colabug;

import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)

public class MyActivityTest {
    @Test
    public void shouldNotBeNull() throws Exception {
        MyActivity activity = new MyActivity();
        assertNotNull(activity);
    }
}

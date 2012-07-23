package com.chariotsolutions.colabug;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xtremelabs.robolectric.shadows.ShadowToast;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import support.ProjectTestRunner;

import static com.xtremelabs.robolectric.shadows.ShadowToast.getLatestToast;
import static com.xtremelabs.robolectric.shadows.ShadowToast.getTextOfLatestToast;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static support.ProjectTestRunner.assertViewIsVisible;
import static support.ProjectTestRunner.getResourceDrawable;
import static support.ProjectTestRunner.getResourceString;

@RunWith(ProjectTestRunner.class)

public class MyActivityTest {

    private MyActivity activity;
    private TextView welcomeText;
    private ImageView image;

    @Before
    public void setUp() throws Exception {
        activity = new MyActivity();
        activity.onCreate(null);

        welcomeText = (TextView) activity.findViewById(R.id.welcome_text_view);
        image = (ImageView) activity.findViewById(R.id.sun_earth_image);
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

    @Test
    public void welcomeTextClickShouldToastUser() throws Exception {
        welcomeText.performClick();
        assertThat(getTextOfLatestToast(),
                   equalTo(getResourceString(R.string.WELCOME_TOAST)));
    }

    @Test
    public void shouldHaveImage() throws Exception {
        assertViewIsVisible(image);
    }

    @Test
    public void imageShouldEqualResourceDrawable() throws Exception {
        assertThat(image.getDrawable(),
                   equalTo(getResourceDrawable(R.drawable.sun_earth)));
    }

    @Test
    public void shortToast_shouldToastStringPassedForShortDuration() throws Exception {
        String testString = "Test string";
        activity.shortToast(testString);
        assertThat(getTextOfLatestToast(), equalTo(testString));
        assertThat(getLatestToast().getDuration(),
                   equalTo(Toast.LENGTH_SHORT));
    }
}

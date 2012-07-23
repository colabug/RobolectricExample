package support;

import android.graphics.drawable.Drawable;
import android.view.View;

import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.RobolectricTestRunner;

import org.junit.runners.model.InitializationError;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ProjectTestRunner extends RobolectricTestRunner {

    public ProjectTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    public static String getResourceString(int resourceId) {
        return Robolectric.application.getApplicationContext().getString(resourceId);
    }

    public static Drawable getResourceDrawable(int resourceId) {
        return Robolectric.application.getApplicationContext().getResources().getDrawable(resourceId);
    }

    public static void assertViewIsVisible(View view) {
        assertNotNull(view);
        assertThat(view.getVisibility(), equalTo(View.VISIBLE));
    }
}

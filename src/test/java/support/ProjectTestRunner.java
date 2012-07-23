package support;

import android.view.View;

import com.xtremelabs.robolectric.RobolectricTestRunner;

import org.junit.runners.model.InitializationError;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ProjectTestRunner extends RobolectricTestRunner {

    public ProjectTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    public static void assertViewIsVisible(View view) {
        assertNotNull(view);
        assertThat(view.getVisibility(), equalTo(View.VISIBLE));
    }
}

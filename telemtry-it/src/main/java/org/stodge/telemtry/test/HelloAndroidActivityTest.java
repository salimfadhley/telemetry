package org.stodge.telemtry.test;

import android.test.ActivityInstrumentationTestCase2;
import org.stodge.telemtry.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super("org.stodge.telemtry", HelloAndroidActivity.class);
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}


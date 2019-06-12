package io.clappr.player.base;

import android.content.Context;

import io.clappr.player.BuildConfig;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowApplication;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 23)
public class UIObjectJavaTest {
    Context context;

    @Before
    public void setup() {
        BaseObject.Companion.setApplicationContext(ShadowApplication.getInstance().getApplicationContext());
    }

    @Test
    public void uiObjectCreation() {
        UIObject uo = new UIObject();
        assertTrue("invalid view", uo.getView() != null);
    }
}

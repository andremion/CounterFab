package com.andremion.counterfab.sample;

import android.content.pm.ActivityInfo;

import com.facebook.testing.screenshot.Screenshot;

import org.junit.Rule;
import org.junit.Test;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class MainActivityTest {

    @Rule
    public final ActivityTestRule<MainActivity> testRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void shouldRenderProperly() {

        Screenshot.snapActivity(testRule.getActivity()).record();
    }

    @Test
    public void shouldRenderProperlyAfterOrientationChanged() {

        testRule.getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        InstrumentationRegistry.getInstrumentation().waitForIdleSync();

        Screenshot.snapActivity(testRule.getActivity()).record();
    }

    @Test
    public void shouldKeepStateAfterOrientationChanged() {
        onView(withId(R.id.fab)).perform(click(), click());

        testRule.getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        InstrumentationRegistry.getInstrumentation().waitForIdleSync();

        Screenshot.snapActivity(testRule.getActivity()).record();
    }
}
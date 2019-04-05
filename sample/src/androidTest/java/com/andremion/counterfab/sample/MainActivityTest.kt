package com.andremion.counterfab.sample

import android.content.pm.ActivityInfo
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.andremion.counterfab.sample.helpers.setFabSize
import com.facebook.testing.screenshot.Screenshot
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val testRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun shouldRenderProperly() {

        Screenshot.snapActivity(testRule.activity).record()
    }

    @Test
    fun shouldRenderProperlyAfterOrientationChanged() {

        testRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        InstrumentationRegistry.getInstrumentation().waitForIdleSync()

        Screenshot.snapActivity(testRule.activity).record()
    }

    @Test
    fun shouldKeepStateAfterOrientationChanged() {
        onView(withId(R.id.fab)).perform(click(), click())

        testRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        InstrumentationRegistry.getInstrumentation().waitForIdleSync()

        Screenshot.snapActivity(testRule.activity).record()
    }

    @Test
    fun shouldRenderSizeMiniProperly() {
        onView(withId(R.id.fab)).perform(setFabSize(FloatingActionButton.SIZE_MINI))

        Screenshot.snapActivity(testRule.activity).record()
    }

    @Test
    fun shouldRenderSizeMiniProperlyAfterOrientationChanged() {
        onView(withId(R.id.fab)).perform(setFabSize(FloatingActionButton.SIZE_MINI))

        testRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        InstrumentationRegistry.getInstrumentation().waitForIdleSync()

        Screenshot.snapActivity(testRule.activity).record()
    }

    @Test
    fun shouldKeepSizeMiniStateAfterOrientationChanged() {
        onView(withId(R.id.fab)).perform(click(), click())

        testRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        InstrumentationRegistry.getInstrumentation().waitForIdleSync()

        Screenshot.snapActivity(testRule.activity).record()
    }
}
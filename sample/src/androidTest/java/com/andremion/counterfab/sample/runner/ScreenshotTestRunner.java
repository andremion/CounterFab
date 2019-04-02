package com.andremion.counterfab.sample.runner;

import android.os.Bundle;

import com.facebook.testing.screenshot.ScreenshotRunner;

import androidx.test.runner.AndroidJUnitRunner;

public class ScreenshotTestRunner extends AndroidJUnitRunner {
    @Override
    public void onCreate(Bundle arguments) {
        ScreenshotRunner.onCreate(this, arguments);
        super.onCreate(arguments);
    }

    @Override
    public void finish(int resultCode, Bundle results) {
        ScreenshotRunner.onDestroy();
        super.finish(resultCode, results);
    }
}
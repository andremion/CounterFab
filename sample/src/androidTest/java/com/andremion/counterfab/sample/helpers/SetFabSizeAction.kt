package com.andremion.counterfab.sample.helpers

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton.Size
import org.hamcrest.Matcher

fun setFabSize(@Size fabSize: Int) = SetFabSizeAction(fabSize)

class SetFabSizeAction(@Size private val fabSize: Int) : ViewAction {

    override fun getConstraints(): Matcher<View> {
        return ViewMatchers.isAssignableFrom(FloatingActionButton::class.java)
    }

    override fun perform(uiController: UiController, view: View) {
        val floatingActionButton = view as FloatingActionButton
        floatingActionButton.size = fabSize
    }

    override fun getDescription() = "set fab size to"
}
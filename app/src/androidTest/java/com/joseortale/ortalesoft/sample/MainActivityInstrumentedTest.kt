package com.joseortale.ortalesoft.sample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.rule.ActivityTestRule
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityInstrumentedTest {
    private lateinit var stringToBetyped: String

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.joseortale.ortalesoft.sample", appContext.packageName)
    }

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkText_isCorrect() {
        stringToBetyped = "Async"

        onView(withId(R.id.et_text))
                .perform(typeText(stringToBetyped), closeSoftKeyboard())
        onView(withId(R.id.bt_submit)).perform(click())

        onView(withId(R.id.tv_result))
                .check(matches(withText("Correct!")))
    }

    @Test
    fun checkText_isIncorrect() {
        stringToBetyped = "0sync"

        onView(withId(R.id.et_text))
                .perform(typeText(stringToBetyped), closeSoftKeyboard())
        onView(withId(R.id.bt_submit)).perform(click())

        onView(withId(R.id.tv_result))
                .check(matches(withText("Incorrect!")))
    }
}
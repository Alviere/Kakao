package com.agoda.kakao.matchers

import android.support.test.espresso.matcher.BoundedMatcher
import android.view.View
import android.widget.TextView
import org.hamcrest.Description

/**
 * Matches TextView views which contains any text
 *
 * @see TextView
 */
class AnyTextMatcher : BoundedMatcher<View, TextView>(TextView::class.java) {
    override fun describeTo(desc: Description) {
        desc.appendText("which has any text")
    }

    override fun matchesSafely(view: TextView?): Boolean =
            view?.text?.toString()?.isNotEmpty() ?: false
}
@file:Suppress("unused")

package com.agoda.kakao.common.matchers

import android.support.test.espresso.matcher.BoundedMatcher
import android.view.View
import android.widget.RatingBar
import org.hamcrest.Description

/**
 * Matcher of value rating of given matcher
 *
 * @param value of rating that matched the view which is RatingBar
 */
class RatingBarMatcher(private val value: Float) : BoundedMatcher<View, RatingBar>(RatingBar::class.java) {
    override fun matchesSafely(view: RatingBar?) = view?.let { it.rating == value } ?: false

    override fun describeTo(description: Description) {
        description.appendText("rating value is: $value")
    }
}
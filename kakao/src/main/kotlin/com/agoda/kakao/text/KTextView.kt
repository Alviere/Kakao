@file:Suppress("unused")

package com.agoda.kakao.text

import android.support.test.espresso.DataInteraction
import android.view.View
import com.agoda.kakao.common.builders.ViewBuilder
import com.agoda.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with BaseActions and TextViewAssertions
 *
 * @see BaseActions
 * @see TextViewActions
 * @see TextViewAssertions
 */
class KTextView : KBaseView<KTextView>, TextViewActions, TextViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
[kakao](../../index.md) / [com.agoda.kakao.recycler](../index.md) / [RecyclerActions](index.md) / [scrollTo](./scroll-to.md)

# scrollTo

`open fun scrollTo(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Overrides [ScrollableActions.scrollTo](../../com.agoda.kakao.common.actions/-scrollable-actions/scroll-to.md)

Scrolls to the specific position of the view

### Parameters

`position` - Scrolling destination`open fun scrollTo(matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Scrolls to specific view holder that matches given matcher

### Parameters

`matcher` - Matcher for view holder, which is scroll destination`open fun scrollTo(viewBuilder: `[`ViewBuilder`](../../com.agoda.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Scrolls to specific view holder that matches given matcher

### Parameters

`viewBuilder` - Builder that will be used to match view to scroll
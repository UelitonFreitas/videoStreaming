package io.clappr.player.shadows

import android.view.View
import org.robolectric.annotation.Implementation
import org.robolectric.annotation.Implements
import org.robolectric.shadows.ShadowView

@Implements(View::class)
class ClapprShadowView : ShadowView() {
    var viewWidth: Int = 0

    @Implementation
    fun getWidth() = viewWidth
}
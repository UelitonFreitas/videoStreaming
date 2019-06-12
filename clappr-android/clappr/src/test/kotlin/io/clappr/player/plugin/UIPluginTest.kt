package io.clappr.player.plugin

import android.view.View
import io.clappr.player.BuildConfig
import io.clappr.player.base.BaseObject
import io.clappr.player.base.UIObject
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowApplication

fun setupViewVisible(plugin: UIPlugin) {
    plugin.view?.visibility = View.VISIBLE
    plugin.visibility = UIPlugin.Visibility.VISIBLE
}

fun assertVisibleView(plugin: UIPlugin) {
    kotlin.test.assertEquals(View.VISIBLE, plugin.view?.visibility)
    kotlin.test.assertEquals(UIPlugin.Visibility.VISIBLE, plugin.visibility)
}

fun setupViewHidden(plugin: UIPlugin) {
    plugin.view?.visibility = View.GONE
    plugin.visibility = UIPlugin.Visibility.HIDDEN
}

fun assertHiddenView(plugin: UIPlugin) {
    kotlin.test.assertEquals(View.GONE, plugin.view?.visibility)
    kotlin.test.assertEquals(UIPlugin.Visibility.HIDDEN, plugin.visibility)
}

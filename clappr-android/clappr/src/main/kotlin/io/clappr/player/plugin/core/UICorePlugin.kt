package io.clappr.player.plugin.core

import io.clappr.player.base.NamedType
import io.clappr.player.base.UIObject
import io.clappr.player.components.Core
import io.clappr.player.plugin.UIPlugin

open class UICorePlugin(core: Core, override val base: UIObject = UIObject(), name: String = Companion.name) :
        CorePlugin(core, base, name), UIPlugin {
    companion object : NamedType {
        override val name: String = "uicoreplugin"
    }

    override var visibility = UIPlugin.Visibility.HIDDEN

    override val uiObject: UIObject
        get() = base
}
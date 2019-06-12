package io.clappr.player.plugin.container

import io.clappr.player.base.NamedType
import io.clappr.player.base.UIObject
import io.clappr.player.components.Container
import io.clappr.player.plugin.UIPlugin

open class UIContainerPlugin(
        container: Container, override val base: UIObject = UIObject(), name: String = Companion.name) : UIPlugin,
        ContainerPlugin(container, base, name) {
    companion object : NamedType {
        override val name: String = "uicontainerplugin"
    }

    override var visibility = UIPlugin.Visibility.HIDDEN

    override val uiObject: UIObject
        get() = base
}
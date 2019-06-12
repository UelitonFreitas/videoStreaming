package io.clappr.player.plugin.control

import io.clappr.player.R
import io.clappr.player.base.Event
import io.clappr.player.base.EventHandler
import io.clappr.player.base.InternalEvent
import io.clappr.player.base.NamedType
import io.clappr.player.components.Core
import io.clappr.player.components.Playback
import io.clappr.player.plugin.PluginEntry

open class PlayButton(core: Core) : ButtonPlugin(core, name) {

    companion object : NamedType {
        override val name = "playButton"

        val entry = PluginEntry.Core(name = name, factory = { core -> PlayButton(core) })
    }

    override var panel: Panel = Panel.CENTER

    override val resourceDrawable: Int
        get() = R.drawable.play_button

    override val idResourceDrawable: Int
        get() = R.id.play_pause_button

    override val resourceLayout: Int
        get() = R.layout.button_plugin

    private val playbackListenerIds = mutableListOf<String>()

    init {
        bindCoreEvents()
    }

    open fun bindCoreEvents() {
        listenTo(core, InternalEvent.DID_CHANGE_ACTIVE_PLAYBACK.value) {
            bindPlaybackEvents()
            updateState()
        }
    }

    private fun bindPlaybackEvents() {
        stopPlaybackListeners()

        core.activePlayback?.let {
            val updateStateCallback: EventHandler = { updateState() }

            playbackListenerIds.add(listenTo(it, Event.DID_PAUSE.value, updateStateCallback))
            playbackListenerIds.add(listenTo(it, Event.DID_STOP.value, updateStateCallback))
            playbackListenerIds.add(listenTo(it, Event.DID_COMPLETE.value, updateStateCallback))
            playbackListenerIds.add(listenTo(it, Event.PLAYING.value, updateStateCallback))
            playbackListenerIds.add(listenTo(it, Event.STALLING.value, updateStateCallback))
        }
    }

    private fun stopPlaybackListeners() {
        playbackListenerIds.forEach(::stopListening)
        playbackListenerIds.clear()
    }

    private fun updateState() {
        core.activePlayback?.let {
            when (it.state) {
                Playback.State.STALLING -> hide()
                Playback.State.PLAYING -> if (it.canPause) showPauseIcon() else showStopIcon()
                else -> showPlayIcon()
            }
        }
    }

    open fun showPauseIcon() {
        show()
        view.isSelected = true
    }

    open fun showPlayIcon() {
        show()
        view.isSelected = false
    }

    private fun showStopIcon() {
        hide()
    }

    override fun onClick() {
        core.trigger(InternalEvent.DID_TOUCH_MEDIA_CONTROL.value)
        core.activePlayback?.let {
            if (it.state == Playback.State.PLAYING) {
                if (it.canPause) it.pause() else it.stop()
            } else if (it.canPlay) {
                it.play()
            }
            it
        }
    }

    override fun render() {
        super.render()
        updateState()
    }

    override fun destroy() {
        stopPlaybackListeners()
        super.destroy()
    }
}
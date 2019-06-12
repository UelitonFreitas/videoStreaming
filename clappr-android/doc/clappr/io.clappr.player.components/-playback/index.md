[clappr](../../index.md) / [io.clappr.player.components](../index.md) / [Playback](./index.md)

# Playback

`abstract class Playback : `[`UIObject`](../../io.clappr.player.base/-u-i-object/index.md)`, `[`NamedType`](../../io.clappr.player.base/-named-type/index.md)

### Types

| Name | Summary |
|---|---|
| [MediaType](-media-type/index.md) | `enum class MediaType` |
| [State](-state/index.md) | `enum class State` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Playback(source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, mimeType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, options: `[`Options`](../../io.clappr.player.base/-options/index.md)` = Options(), name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "", supportsSource: `[`PlaybackSupportCheck`](../-playback-support-check.md)` = { _, _ -> false })` |

### Properties

| Name | Summary |
|---|---|
| [avgBitrate](avg-bitrate.md) | `open val avgBitrate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [bitrate](bitrate.md) | `open val bitrate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [canPause](can-pause.md) | `open val canPause: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [canPlay](can-play.md) | `open val canPlay: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [canSeek](can-seek.md) | `open val canSeek: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [currentDate](current-date.md) | `open val currentDate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [currentTime](current-time.md) | `open val currentTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [duration](duration.md) | `open val duration: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [hasMediaOptionAvailable](has-media-option-available.md) | `open val hasMediaOptionAvailable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isDvrAvailable](is-dvr-available.md) | `open val isDvrAvailable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isDvrInUse](is-dvr-in-use.md) | `open val isDvrInUse: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [mediaOptionList](media-option-list.md) | `var mediaOptionList: `[`LinkedList`](https://developer.android.com/reference/java/util/LinkedList.html)`<`[`MediaOption`](../-media-option/index.md)`>` |
| [mediaType](media-type.md) | `open val mediaType: `[`MediaType`](-media-type/index.md) |
| [mimeType](mime-type.md) | `var mimeType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | `open val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [options](options.md) | `var options: `[`Options`](../../io.clappr.player.base/-options/index.md) |
| [position](position.md) | `open val position: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [selectedMediaOptionList](selected-media-option-list.md) | `var selectedMediaOptionList: `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`MediaOption`](../-media-option/index.md)`>` |
| [source](source.md) | `var source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [state](state.md) | `open val state: `[`State`](-state/index.md) |
| [supportsSource](supports-source.md) | `val supportsSource: `[`PlaybackSupportCheck`](../-playback-support-check.md) |
| [volume](volume.md) | `open var volume: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`?`<br>Playback volume. Its not the device volume. If the playback has this capability. You can set the volume from 0.0f to 1.0f. Where 0.0f is muted and 1.0f is the playback maximum volume. PS.: If you set a volume less than 0.0f we'll set the volume to 0.0f PS.: If you set a volume greater than 1.0f we'll set the volume to 1.0f |

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../../io.clappr.player.base/-u-i-object/view.md) | `var view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?` |
| [viewClass](../../io.clappr.player.base/-u-i-object/view-class.md) | `open val viewClass: `[`Class`](https://developer.android.com/reference/java/lang/Class.html)`<*>` |

### Functions

| Name | Summary |
|---|---|
| [addAvailableMediaOption](add-available-media-option.md) | `fun addAvailableMediaOption(media: `[`MediaOption`](../-media-option/index.md)`, index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = mediaOptionList.size): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [availableMediaOptions](available-media-options.md) | `fun availableMediaOptions(type: `[`MediaOptionType`](../-media-option-type/index.md)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`MediaOption`](../-media-option/index.md)`>` |
| [createAudioMediaOptionFromLanguage](create-audio-media-option-from-language.md) | `fun createAudioMediaOptionFromLanguage(language: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, raw: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`MediaOption`](../-media-option/index.md) |
| [createOriginalOption](create-original-option.md) | `fun createOriginalOption(raw: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`MediaOption`](../-media-option/index.md) |
| [createSubtitleMediaOptionFromLanguage](create-subtitle-media-option-from-language.md) | `fun createSubtitleMediaOptionFromLanguage(language: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, raw: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`MediaOption`](../-media-option/index.md) |
| [destroy](destroy.md) | `open fun destroy(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [hasMediaOptionAvailable](has-media-option-available.md) | `fun hasMediaOptionAvailable(mediaOption: `[`MediaOption`](../-media-option/index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [load](load.md) | `open fun load(source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, mimeType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [pause](pause.md) | `open fun pause(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [play](play.md) | `open fun play(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [render](render.md) | `open fun render(): `[`UIObject`](../../io.clappr.player.base/-u-i-object/index.md) |
| [seek](seek.md) | `open fun seek(seconds: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [seekToLivePosition](seek-to-live-position.md) | `open fun seekToLivePosition(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [selectedMediaOption](selected-media-option.md) | `fun selectedMediaOption(type: `[`MediaOptionType`](../-media-option-type/index.md)`): `[`MediaOption`](../-media-option/index.md)`?` |
| [setSelectedMediaOption](set-selected-media-option.md) | `open fun setSelectedMediaOption(mediaOption: `[`MediaOption`](../-media-option/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setupInitialMediasFromClapprOptions](setup-initial-medias-from-clappr-options.md) | `fun setupInitialMediasFromClapprOptions(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [startAt](start-at.md) | `open fun startAt(seconds: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [stop](stop.md) | `open fun stop(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inherited Functions

| Name | Summary |
|---|---|
| [remove](../../io.clappr.player.base/-u-i-object/remove.md) | `fun remove(): `[`UIObject`](../../io.clappr.player.base/-u-i-object/index.md) |

### Companion Object Properties

| Name | Summary |
|---|---|
| [mediaOptionsArrayJson](media-options-array-json.md) | `const val mediaOptionsArrayJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [mediaOptionsNameJson](media-options-name-json.md) | `const val mediaOptionsNameJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [mediaOptionsTypeJson](media-options-type-json.md) | `const val mediaOptionsTypeJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [ExoPlayerPlayback](../../io.clappr.player.playback/-exo-player-playback/index.md) | `open class ExoPlayerPlayback : `[`Playback`](./index.md) |
| [MediaPlayerPlayback](../../io.clappr.player.playback/-media-player-playback/index.md) | `class MediaPlayerPlayback : `[`Playback`](./index.md) |
| [NoOpPlayback](../../io.clappr.player.playback/-no-op-playback/index.md) | `class NoOpPlayback : `[`Playback`](./index.md) |

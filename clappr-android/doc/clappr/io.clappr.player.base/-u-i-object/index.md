[clappr](../../index.md) / [io.clappr.player.base](../index.md) / [UIObject](./index.md)

# UIObject

`open class UIObject : `[`BaseObject`](../-base-object/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UIObject()` |

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `var view: `[`View`](https://developer.android.com/reference/android/view/View.html)`?` |
| [viewClass](view-class.md) | `open val viewClass: `[`Class`](https://developer.android.com/reference/java/lang/Class.html)`<*>` |

### Inherited Properties

| Name | Summary |
|---|---|
| [id](../-base-object/id.md) | `open val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [remove](remove.md) | `fun remove(): `[`UIObject`](./index.md) |
| [render](render.md) | `open fun render(): `[`UIObject`](./index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [listenTo](../-base-object/listen-to.md) | `open fun listenTo(obj: `[`EventInterface`](../-event-interface/index.md)`, eventName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, handler: `[`EventHandler`](../-event-handler.md)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [off](../-base-object/off.md) | `open fun off(listenId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [on](../-base-object/on.md) | `open fun on(eventName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, handler: `[`EventHandler`](../-event-handler.md)`, obj: `[`EventInterface`](../-event-interface/index.md)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [once](../-base-object/once.md) | `open fun once(eventName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, handler: `[`EventHandler`](../-event-handler.md)`, obj: `[`EventInterface`](../-event-interface/index.md)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [stopListening](../-base-object/stop-listening.md) | `open fun stopListening(listenId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [trigger](../-base-object/trigger.md) | `open fun trigger(eventName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, userData: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [Container](../../io.clappr.player.components/-container/index.md) | `class Container : `[`UIObject`](./index.md) |
| [Core](../../io.clappr.player.components/-core/index.md) | `class Core : `[`UIObject`](./index.md) |
| [Playback](../../io.clappr.player.components/-playback/index.md) | `abstract class Playback : `[`UIObject`](./index.md)`, `[`NamedType`](../-named-type/index.md) |

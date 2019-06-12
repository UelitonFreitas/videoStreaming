package io.clappr.player.log

import android.util.Log
import io.clappr.player.BuildConfig
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowLog
import kotlin.test.assertEquals

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, sdk = [23], shadows = [ShadowLog::class])
class LoggerTest {

    private val tag = "Clappr"

    @Test
    fun shouldFormatMessageWithScopeInDebugLog() {
        val scope = "scope"
        val message = "message"
        val expectedLogMessage = "[$scope] $message"

        Logger.debug(scope, message)

        assertEquals(tag, ShadowLog.getLogs()[0].tag)
        assertEquals(Log.DEBUG, ShadowLog.getLogs()[0].type)
        assertEquals(expectedLogMessage, ShadowLog.getLogs()[0].msg)
    }

    @Test
    fun shouldFormatMessageWithoutScopeInDebugLog() {
        val message = "message"
        val expectedLogMessage = "message"

        Logger.debug(null, message)

        assertEquals(tag, ShadowLog.getLogs()[0].tag)
        assertEquals(Log.DEBUG, ShadowLog.getLogs()[0].type)
        assertEquals(expectedLogMessage, ShadowLog.getLogs()[0].msg)
    }

    @Test
    fun shouldFormatMessageWithScopeInInfoLog() {
        val scope = "scope"
        val message = "message"
        val expectedLogMessage = "[$scope] $message"

        Logger.info(scope, message)

        assertEquals(tag, ShadowLog.getLogs()[0].tag)
        assertEquals(Log.INFO, ShadowLog.getLogs()[0].type)
        assertEquals(expectedLogMessage, ShadowLog.getLogs()[0].msg)
    }

    @Test
    fun shouldFormatMessageWithoutScopeInInfoLog() {
        val message = "message"
        val expectedLogMessage = "message"

        Logger.info(null, message)

        assertEquals(tag, ShadowLog.getLogs()[0].tag)
        assertEquals(Log.INFO, ShadowLog.getLogs()[0].type)
        assertEquals(expectedLogMessage, ShadowLog.getLogs()[0].msg)
    }

    @Test
    fun shouldFormatMessageWithScopeInWarningLog() {
        val scope = "scope"
        val message = "message"
        val expectedLogMessage = "[$scope] $message"

        Logger.warning(scope, message)

        assertEquals(tag, ShadowLog.getLogs()[0].tag)
        assertEquals(Log.WARN, ShadowLog.getLogs()[0].type)
        assertEquals(expectedLogMessage, ShadowLog.getLogs()[0].msg)
    }

    @Test
    fun shouldFormatMessageWithoutScopeInWarningLog() {
        val message = "message"
        val expectedLogMessage = "message"

        Logger.warning(null, message)

        assertEquals(tag, ShadowLog.getLogs()[0].tag)
        assertEquals(Log.WARN, ShadowLog.getLogs()[0].type)
        assertEquals(expectedLogMessage, ShadowLog.getLogs()[0].msg)
    }

    @Test
    fun shouldFormatMessageWithScopeInErrorLog() {
        val scope = "scope"
        val message = "message"
        val expectedLogMessage = "[$scope] $message"

        Logger.error(scope, message)

        assertEquals(tag, ShadowLog.getLogs()[0].tag)
        assertEquals(Log.ERROR, ShadowLog.getLogs()[0].type)
        assertEquals(expectedLogMessage, ShadowLog.getLogs()[0].msg)
    }

    @Test
    fun shouldFormatMessageWithoutScopeInErrorLog() {
        val message = "message"
        val expectedLogMessage = "message"

        Logger.error(null, message)

        assertEquals(tag, ShadowLog.getLogs()[0].tag)
        assertEquals(Log.ERROR, ShadowLog.getLogs()[0].type)
        assertEquals(expectedLogMessage, ShadowLog.getLogs()[0].msg)
    }
}

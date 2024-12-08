package org.example.service

import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import java.net.URI

class DriverDemo {
    private val options = UiAutomator2Options()
        .setUdid("emulator-5554")
        .setApp("app-debug.apk")

    private val driver = AndroidDriver(
        URI.create("http://127.0.0.1:4723").toURL(),
        options
    )

    fun findButtonsTest(): String? {
        try {
            val el = driver.findElements(AppiumBy.xpath("//android.widget.Button"))
            println("### DEMO ### ${el.size} buttons found")
            el.firstOrNull()?.click()
            val source = driver.pageSource
            return source
        } finally {
            driver.quit()
        }
    }
}
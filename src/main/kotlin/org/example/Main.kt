package org.example

import io.appium.java_client.service.local.AppiumDriverLocalService
import org.example.service.DriverDemo

fun main() {
    val service = AppiumDriverLocalService.buildDefaultService()
    service.start()

    try {
        DriverDemo().findButtonsTest()?.also { println(it) }
    } finally {
        service.stop()
    }
}
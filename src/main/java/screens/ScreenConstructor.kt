package screens

import io.appium.java_client.AppiumBy.ByClassName

data class ScreenConstructor(
        var androidAccessibilityId: String = "",
        val androidId: String = "",
        val androidXpath: String = "",
        val androidClassName: String = "",
        val iosAccessibilityId: String = "",
        val iosId: String = "",
        val iosXpath: String = "",
        val iosClassChain: String = "",
        val iosClassName: String = "",
        val iosPredicateSting: String = "",
        val elementName: String = ""
)
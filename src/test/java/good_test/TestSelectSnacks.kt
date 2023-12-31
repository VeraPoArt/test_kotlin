package good_test

import GlobalVariables.androidDriver
import MainActivity
import org.testng.annotations.Test
import java.util.concurrent.TimeUnit
import screens.Onboarding.selectSnacks
import screens.TestFunctions.clickToElement
import screens.TestFunctions.tapByCoordinates

class TestSelectSnacks : MainActivity() {

    @Test
    fun testSelectSnacks () {
        println("Выбор закуски")
        clickToElement(selectSnacks.androidAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(5)

        // кладем выбранную позицию
        tapByCoordinates(153, 1038)
        TimeUnit.SECONDS.sleep(5)

        // нажимаем на кнопку с ценой
        tapByCoordinates(603, 1991)
        TimeUnit.SECONDS.sleep(7)

        // нажимаем на кнопку с корзиной
        val x1 = 893
        val y1 = 1918
        val x2 = 1025
        val y2 = 2050
        val xCenter = (x1 + x2) / 2
        val yCenter = (y1 + y2) / 2
        tapByCoordinates(xCenter, yCenter)
        TimeUnit.SECONDS.sleep(5)

        // нажимаем на кнопку/не кнопку
        tapByCoordinates(553, 2000)
        TimeUnit.SECONDS.sleep(5)

    }
}
package com.google.samples.apps.nowinandroid.ui.homeworks.homework15

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.google.samples.apps.nowinandroid.MainActivity
import com.kaspersky.components.composesupport.config.withComposeSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.github.kakaocup.compose.KakaoCompose
import org.junit.Rule
import org.junit.Test

class Homework15Test : TestCase(Kaspresso.Builder.withComposeSupport()) {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    val mainScreen = MainScreen(composeTestRule)
    val searchScreen = SearchScreen(composeTestRule)

    @Test
    fun checkSearchElements(){
        run {
            step("Проверяем элементы главного экрана") {
                mainScreen.topBarTitle.assertIsDisplayed()
                mainScreen.topBarSearch.assertIsDisplayed()
                mainScreen.topBarSetting.assertIsDisplayed()

                mainScreen.contentTitleMainScreen.assertIsDisplayed()
                mainScreen.contentSubtitleMainScreen.assertIsDisplayed()
                mainScreen.actionButtonMainScreen.assertIsDisplayed()
            }

            step("Нажимаем на иконку поиска") {
                mainScreen.topBarSearch.performClick()
            }

            step("Проверяем элементы на экране поиска") {
                searchScreen.backIconButton.assertIsDisplayed()
                searchScreen.searchInput.assertIsDisplayed()
                searchScreen.searchClearIcon.assertIsDisplayed()
            }
        }
    }
}
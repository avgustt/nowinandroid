
package com.google.samples.apps.nowinandroid.ui.homeworks.homework15


import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class MainScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<MainScreen>(semanticsProvider) {
        val doneButton = KNode(semanticsProvider) {
            hasText("Done")
            useUnmergedTree = true
        }
    val topBarTitle = child<KNode> {
        hasTestTag("NiaTopAppBarTitle")
    }

    val topBarSearch = child<KNode> {
        hasTestTag("NiaTopAppBarSearchIcon")
    }

    val topBarSetting = child<KNode> {
        hasTestTag("NiaTopAppBarSettingsIcon")
    }

    val contentTitleMainScreen = child<KNode> {
        hasTestTag("NiaContentHeaderTitle")
    }

    val contentSubtitleMainScreen = child<KNode> {
        hasTestTag("NiaContentHeaderSubtitle")
    }

    val actionButtonMainScreen = child<KNode> {
        hasTestTag("NiaContentActionButton")
        }


}
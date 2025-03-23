package com.google.samples.apps.nowinandroid.ui.homeworks.homework15

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class SearchScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<SearchScreen>(semanticsProvider) {

    val backIconButton = child<KNode> {
        hasTestTag("NiaSearchTopBarBackIcon")
    }

    val searchInput = child<KNode> {
        hasTestTag("NiaSearchTopBarTextField")
    }

    val searchClearIcon = child<KNode> {
        hasTestTag("NiaSearchTopBarClearIcon")
    }
}
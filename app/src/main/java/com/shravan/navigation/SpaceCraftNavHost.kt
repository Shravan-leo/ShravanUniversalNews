package com.shravan.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.shravan.presentation.view_models.NewsViewModel

@Composable
fun SpaceCraftNavHost() {
    val navController = rememberNavController()
    val newsViewModel: NewsViewModel = hiltViewModel()

    NavHost(navController = navController, startDestination = Routes.ARTICLE_LIST_SCREEN) {
        //route to task screen
        articleListRoute(
            newsViewModel = newsViewModel,
            navController = navController
        )
        // route to article details
        articleDetailsRoute(
            newsViewModel = newsViewModel,
            navController = navController
        )
    }
}



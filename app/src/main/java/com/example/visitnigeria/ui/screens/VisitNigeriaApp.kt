package com.example.visitnigeria.ui.screens

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.visitnigeria.R
import com.example.visitnigeria.ui.VisitNigeriaViewModel
import com.example.visitnigeria.ui.theme.VisitNigeriaTheme
import com.example.visitnigeria.utils.VisitNigeriaScreen

@Composable
fun VisitNigeriaApp(
    viewModel: VisitNigeriaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = VisitNigeriaScreen.valueOf(
        backStackEntry?.destination?.route ?: VisitNigeriaScreen.Category.name
    )
    val uiState by viewModel.uiState.collectAsState()

    val appName = stringResource(R.string.app_name)
    val categoryName: String = stringResource(uiState.currentCategory.name)
    val recommendationName = stringResource(uiState.selectedRecommendation.name)

    Scaffold (
        topBar = {
            VisitNigeriaAppBar(
                canNavigateBack = navController.previousBackStackEntry != null,
                screenTitle = when (currentScreen.name) {
                    VisitNigeriaScreen.Category.name -> appName
                    VisitNigeriaScreen.Recommendation.name -> categoryName
                    VisitNigeriaScreen.Detail.name -> recommendationName
                    else -> appName
                },
                navigateUp = { navController.navigateUp() },
                isHomeScreen = currentScreen.name == VisitNigeriaScreen.Category.name,
            )
        }
    ) {innerPadding ->
        NavHost(
            navController = navController,
            startDestination = VisitNigeriaScreen.Category.name,
            modifier = Modifier.padding(innerPadding),
            enterTransition = { EnterTransition.None},
            exitTransition = { ExitTransition.None},
        ) {
            composable(
                route = VisitNigeriaScreen.Category.name,
                enterTransition = {
                    slideIntoContainer(
                        towards = AnimatedContentTransitionScope.SlideDirection.Start,
                        animationSpec = tween(300, easing = LinearEasing)
                    )
                }
            ) {
                CategoryScreen(
                    categoryItems = uiState.categoryList,
                    onClick = {
                        viewModel.updateCurrentCategory(it)
                        navController.navigate(VisitNigeriaScreen.Recommendation.name)
                    },
                    modifier = Modifier.fillMaxSize()
                )
            }
            composable(
                route = VisitNigeriaScreen.Recommendation.name,
                enterTransition = {
                    slideIntoContainer(
                        towards = AnimatedContentTransitionScope.SlideDirection.Start,
                        animationSpec = tween(300, easing = LinearEasing)
                    )
                },
                exitTransition = {
                    slideOutOfContainer(
                        towards = AnimatedContentTransitionScope.SlideDirection.End,
                        animationSpec = tween(300, easing = EaseOut)
                    )
                }
            ) {
                RecommendationScreen(
                    recommendationList = uiState.currentCategoryRecommendations,
                    onClick = {
                        viewModel.updateCurrentRecommendation(it)
                        navController.navigate(VisitNigeriaScreen.Detail.name)
                    },
                    modifier = Modifier.fillMaxSize()

                )
            }
            composable(
                route = VisitNigeriaScreen.Detail.name,
                enterTransition = {
                    slideIntoContainer(
                        towards = AnimatedContentTransitionScope.SlideDirection.Start,
                        animationSpec = tween(300, easing = LinearEasing)
                    )
                },
                exitTransition = {
                    slideOutOfContainer(
                        towards = AnimatedContentTransitionScope.SlideDirection.End,
                        animationSpec = tween(300, easing = EaseOut)
                    )
                }
            ) {
                InformationScreen(
                    recommendationName = uiState.selectedRecommendation.name,
                    recommendationImage = uiState.selectedRecommendation.image,
                    recommendationDetails = uiState.selectedRecommendation.information,
                    recommendationLocation = uiState.selectedRecommendation.location,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VisitNigeriaAppBar(
    canNavigateBack: Boolean,
    screenTitle: String,
    navigateUp: () -> Unit,
    isHomeScreen: Boolean
) {
    TopAppBar(
        title = {
            Row {
                if (isHomeScreen) {
                    Text(
                        text = screenTitle,
                        style = MaterialTheme.typography.displayMedium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                } else {
                    Text(
                        text = screenTitle,
                        style = MaterialTheme.typography.displaySmall,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        },
        navigationIcon = {
            if(canNavigateBack) {
                IconButton(
                    onClick = navigateUp,
                    content = {
                        Icon(
                            imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                            contentDescription = stringResource(R.string.back)
                        )
                    }
                )
            }
        }
    )
}

@Preview
@Composable
fun VisitNigeriaAppBarPreview() {
    VisitNigeriaTheme (darkTheme = true) {
        VisitNigeriaAppBar(
            canNavigateBack = false,
            screenTitle = stringResource(R.string.app_name),
            navigateUp = {},
            isHomeScreen = true
        )
    }

}
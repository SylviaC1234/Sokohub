package com.sylvia.sokohub.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sylvia.sokohub.ui.screens.about.AboutScreen
import com.sylvia.sokohub.ui.screens.auth.LoginScreen
import com.sylvia.sokohub.ui.screens.auth.RegisterScreen
import com.sylvia.sokohub.ui.screens.home.HomeScreen
import com.sylvia.sokohub.ui.screens.intent.IntentScreen
import com.sylvia.sokohub.ui.screens.onboarding.OnboardingScreen
import com.sylvia.sokohub.ui.screens.product.ProductScreen
import com.sylvia.sokohub.ui.screens.service.ServiceScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ONBOARDING
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController)

        }

        composable(ROUT_REGISTER) {
            RegisterScreen(navController)
        }

        composable(ROUT_ONBOARDING) {
            OnboardingScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }

        composable(ROUT_PRODUCT) {
            ProductScreen(navController)
        }

         composable(ROUT_INTENT) {
             IntentScreen(navController)

         }

    }
}
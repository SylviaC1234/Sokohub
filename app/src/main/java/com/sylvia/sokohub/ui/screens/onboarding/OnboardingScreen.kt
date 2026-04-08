package com.sylvia.sokohub.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sylvia.sokohub.R
import com.sylvia.sokohub.navigation.ROUT_HOME
import com.sylvia.sokohub.ui.theme.newBlue

@Composable
fun OnboardingScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "img",
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Welcome to Sokohub!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.SansSerif,
            color = newBlue

            )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Shop Smarter",
            fontSize = 20.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Everywhere you go",
            fontSize = 20.sp,

            )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Commerce is a vital part of everyday life, influencing how people buy, sell, and exchange goods and services both locally and globally. It plays a key role in the development of economies by creating opportunities for businesses to grow, generate income, and provide employment. Through commerce, producers are able to distribute their products to consumers efficiently, ensuring that people can access the goods they need and want.",
            fontSize = 15.sp,
            textAlign = TextAlign.Justify

            )
        Button(
            onClick = {navController.navigate(ROUT_HOME)},
            colors = ButtonDefaults.buttonColors(newBlue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)
        ) {
            Text(text = "Get Started")

        }









    }








}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview(){
    OnboardingScreen(rememberNavController())
}
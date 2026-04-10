package com.sylvia.sokohub.ui.screens.intent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sylvia.sokohub.navigation.ROUT_HOME
import com.sylvia.sokohub.ui.theme.newBlue

@ExperimentalMaterial3Api
@Composable
fun IntentScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()

    )
    {
        val mContext = LocalContext.current


        //TopAppBar
        TopAppBar(
            title = {
                Text(text = "Home")},
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                }
            },
            actions =  {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "menu")
                }


                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "menu")
                }

            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newBlue,
                navigationIconContentColor = Color.White,
                titleContentColor = Color.White,
                actionIconContentColor = Color.White

            )



        )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(5.dp))


        //button1
        OutlinedButton(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
        ) {
            Text(text = "Pay Via Mpesa")

        }

        //button2
        OutlinedButton(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
        ) {
            Text(text = "Email")

        }


        //button3

        OutlinedButton(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
        ) {
            Text(text = "Send Message")

        }

        //button4
        OutlinedButton(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
        ) {
            Text(text = "Call")

        }

        //button5
        OutlinedButton(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
        ) {
            Text(text = "Share")

        }

        //button6
        OutlinedButton(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
        ) {
            Text(text = "Camera")

        }







    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())
}
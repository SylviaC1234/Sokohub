package com.sylvia.sokohub.ui.screens.about

import android.R.attr.name
import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sylvia.sokohub.navigation.ROUT_HOME
import com.sylvia.sokohub.navigation.ROUT_INTENT
import com.sylvia.sokohub.navigation.ROUT_LOGIN
import com.sylvia.sokohub.ui.theme.newBlue





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController){


    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(


        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Contact Screen") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = newBlue,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                ),
                actions =  {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "menu", tint = Color.White
                        )
                    }


                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Notifications, contentDescription = "menu", tint = Color.White)
                    }

                }
            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newBlue
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home", tint = Color.White) },
                    label = { Text("Home", color = Color.White) },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites", tint = Color.White) },
                    label = { Text("Intent",color = Color.White) },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        navController.navigate(ROUT_INTENT)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile", tint = Color.White) },
                    label = { Text("LogIn",color = Color.White) },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        navController.navigate(ROUT_LOGIN)
                    }
                )



            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = newBlue
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page

                //card1
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                        .height(180.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Blue),
                    elevation = CardDefaults.cardElevation(6.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {

                        // Top Row (Name + Icons)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {

                                Text(text = "John Smith", fontSize = 30.sp, color = Color.White.copy(alpha = 0.7f))
                                Spacer(modifier = Modifier.width(10.dp))

                            }

                            Row {
                                Column() {Icon(Icons.Default.Edit, contentDescription = null, tint = Color.White)}
                                Spacer(modifier = Modifier.width(8.dp))
                                Icon(Icons.Default.Info, contentDescription = null, tint = Color.White)
                            }
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Phone, contentDescription = null, tint = Color.White)
                            Spacer(modifier = Modifier.width(10.dp))


                            val mContext = LocalContext.current
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0717085866".toUri()
                                    mContext.startActivity(callIntent)

                                },
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
                            ) {
                                Text(
                                    text = "+(134)345627",
                                    color = Color.White,
                                    fontSize = 20.sp
                                )

                            }



                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Email, contentDescription = null, tint = Color.White)
                            Spacer(modifier = Modifier.width(8.dp))

                            val mContext = LocalContext.current
                            OutlinedButton(
                                onClick = { val shareIntent = Intent(Intent.ACTION_SEND)
                                    shareIntent.type = "text/plain"
                                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("Sylviac432@gmail.com"))
                                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                                    mContext.startActivity(shareIntent)
                                },
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
                            ) {
                                Text(
                                    text = "JohnSmith@gmail.com",
                                    color = Color.White,
                                    fontSize = 20.sp
                                )


                            }





                        }
                    }
                }

                //card2
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .height(180.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Red),
                    elevation = CardDefaults.cardElevation(6.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {

                        // Top Row (Name + Icons)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {

                                Text(text = "Amanda Black", fontSize = 30.sp, color = Color.White.copy(alpha = 0.7f))
                                Spacer(modifier = Modifier.width(10.dp))

                            }

                            Row {
                                Column() {Icon(Icons.Default.Edit, contentDescription = null, tint = Color.White)}
                                Spacer(modifier = Modifier.width(8.dp))
                                Icon(Icons.Default.Info, contentDescription = null, tint = Color.White)
                            }
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Phone, contentDescription = null, tint = Color.White)
                            Spacer(modifier = Modifier.width(10.dp))


                            val mContext = LocalContext.current
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0717085866".toUri()
                                    mContext.startActivity(callIntent)

                                },
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
                            ) {
                                Text(
                                    text = "+(134)244573817",
                                    color = Color.White,
                                    fontSize = 20.sp
                                )

                            }



                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Email, contentDescription = null, tint = Color.White)
                            Spacer(modifier = Modifier.width(10.dp))

                            val mContext = LocalContext.current
                            OutlinedButton(
                                onClick = { val shareIntent = Intent(Intent.ACTION_SEND)
                                    shareIntent.type = "text/plain"
                                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("Sylviac432@gmail.com"))
                                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                                    mContext.startActivity(shareIntent)
                                },
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
                            ) {
                                Text(
                                    text = "AmandaBlack@gmail.com",
                                    color = Color.White,
                                    fontSize = 20.sp
                                )


                            }





                        }
                    }
                }

                //card3
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .height(180.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Green),
                    elevation = CardDefaults.cardElevation(6.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {

                        // Top Row (Name + Icons)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {

                                Text(text = "David Hill", fontSize = 30.sp, color = Color.White.copy(alpha = 0.7f))
                                Spacer(modifier = Modifier.width(10.dp))

                            }

                            Row {
                                Column() {Icon(Icons.Default.Edit, contentDescription = null, tint = Color.White)}
                                Spacer(modifier = Modifier.width(8.dp))
                                Icon(Icons.Default.Info, contentDescription = null, tint = Color.White)
                            }
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Phone, contentDescription = null, tint = Color.White)
                            Spacer(modifier = Modifier.width(10.dp))


                            val mContext = LocalContext.current
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0717085866".toUri()
                                    mContext.startActivity(callIntent)

                                },
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
                            ) {
                                Text(
                                    text = "+(134)648237402",
                                    color = Color.White,
                                    fontSize = 20.sp
                                )

                            }



                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Email, contentDescription = null, tint = Color.White)
                            Spacer(modifier = Modifier.width(10.dp))

                            val mContext = LocalContext.current
                            OutlinedButton(
                                onClick = { val shareIntent = Intent(Intent.ACTION_SEND)
                                    shareIntent.type = "text/plain"
                                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("Sylviac432@gmail.com"))
                                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                                    mContext.startActivity(shareIntent)
                                },
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier.fillMaxWidth().padding(20.dp,end = 20.dp)
                            ) {
                                Text(
                                    text = "DavidHill@gmail.com",
                                    color = Color.White,
                                    fontSize = 20.sp
                                )


                            }





                        }
                    }
                }












            }
        }
    )

    //End of scaffold





}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}
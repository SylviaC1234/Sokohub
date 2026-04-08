package com.sylvia.sokohub.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sylvia.sokohub.R
import com.sylvia.sokohub.ui.theme.newBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()

    )
    {
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

        Spacer(modifier = Modifier.height(10.dp))

        //Searchbar
        var Search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = Search,
            onValueChange = { Search = it},
            modifier = Modifier.fillMaxWidth().padding(10.dp, end = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "String")},
            placeholder = { Text(text = "Search products/Category...")}
                 )

        //End of Searchbar

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Featured Products",
            fontSize = 20.sp,
            color = newBlue,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 20.dp)

            )


        Spacer(modifier = Modifier.height(10.dp))

        //Row

        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.width(5.dp))
            //column1
            Column() {

                Image(
                    painter = painterResource(R.drawable.grocery1),
                    contentDescription = "img",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop,

                )

                Text(text = "Groceries",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(newBlue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.padding(start = 20.dp)
                ) {
                    Text(text = "Get Started")

                }

            }
            //End of column1

            Spacer(modifier = Modifier.width(10.dp))



            //column2
            Column() {

                Image(
                    painter = painterResource(R.drawable.makeup),
                    contentDescription = "img",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop,

                    )

                Text(text = "Makeup",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(newBlue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.padding(start = 20.dp)
                ) {
                    Text(text = "Get Started")

                }

            }
            //End of column2

            Spacer(modifier = Modifier.width(10.dp))


            //Column3
            Column() {

                Image(
                    painter = painterResource(R.drawable.gymequipment),
                    contentDescription = "img",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop,

                    )

                Text(text = "Gym Equipment",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(newBlue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.padding(start = 20.dp)
                ) {
                    Text(text = "Get Started")

                }

            }
            //End of column3

            Spacer(modifier = Modifier.width(10.dp))


            //Column4
            Column() {

                Image(
                    painter = painterResource(R.drawable.toys),
                    contentDescription = "img",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop,

                    )

                Text(text = "Toys",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(newBlue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.padding(start = 20.dp)
                ) {
                    Text(text = "Get Started")

                }

            }
            //End of column4


        }
        //End of Row


    }













}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}
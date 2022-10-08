package com.belhyto.lemonday

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.belhyto.lemonday.navigation.Screen
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController




@Composable
fun LemondayMenu(modifier: Modifier= Modifier,navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center

    ) {
        val context = LocalContext.current
        Button(
            onClick = { showToast(context, "Clicked on next") },
            modifier = Modifier
                .width(width = 350.dp)
                .height(height = 100.dp)
                .clickable { navController.navigate(route = Screen.Menu.route) },
            elevation = ButtonDefaults.elevation(10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.secondary,
                contentColor = Color.White

            )
        ) {

                Image(
                    painter = painterResource(R.drawable.icon_sign),
                    contentDescription = "icons of options",

                    modifier = Modifier.size(100.dp)
                )
                Text(
                    text = "Learn \n Sign Language",
                    modifier = Modifier.padding(5.dp),
                    style = MaterialTheme.typography.body1,
                )


        }
    }
}

@Composable
@Preview
fun lemonMenuPreview() {

    LemondayMenu(navController = rememberNavController())

}






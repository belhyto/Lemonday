package com.belhyto.lemonday

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.belhyto.lemonday.navigation.Screen
import kotlinx.coroutines.delay


@Composable
fun LemonSplash(modifier: Modifier=Modifier,navController: NavHostController)
{
    Box(modifier= Modifier
        .background(Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center

    ){

        Image(
            painter = painterResource(R.drawable.bookmark),
            contentDescription = "Logo",
            modifier = Modifier.size(120.dp)
                .clickable { navController.navigate(route = Screen.Home.route) },

        )
    }
}
@Composable
@Preview
fun splashPreview()
{
    LemonSplash(  navController = rememberNavController())
}
/*
@Composable
fun LemonSplash(navController: NavHostController) {
    var startAnimation by remember {
        mutableStateOf(false)
    }
    val alphaAnim= animateFloatAsState(
        targetValue = if(startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 3000 //3 seconds
        ))
    LaunchedEffect(key1 = true) //triggers code in block
    {
        startAnimation= true
        delay(4000)
        navController.popBackStack()
        navController.navigate(Screen.Home.route) //navigate to home screen once done
    }
    Splash(alpha= alphaAnim.value)

}
@Composable
fun Splash(alpha: Float)
{
    Box(modifier= Modifier
        .background(Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center

    ){

        Image(
            painter = painterResource(R.drawable.bookmark),
            contentDescription = "Logo",
            modifier = Modifier.size(120.dp)
                               .alpha(alpha=alpha)

        )
    }
}

@Composable
@Preview
fun splashPreview()
{
    Splash(alpha= 1f)
}

 */
package com.example.bijinesucard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bijinesucard.ui.theme.BijinesuCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BijinesuCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Card(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Card(name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        NameInfo(modifier.align(alignment = Alignment.CenterHorizontally))
        Spacer(Modifier.height(20.dp))
        Contact(modifier.align(alignment = Alignment.CenterHorizontally))
    }

}

@Composable
fun NameInfo(modifier: Modifier) {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = modifier
                .height(150.dp)
                .background(
                    color = Color.Blue
                )
        )

        Text(
            text = "X KING",
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
        )
        Text(
            text = "Gamer",
            textAlign = TextAlign.Center,
            modifier = modifier
        )
    }
}

@Composable
fun Contact(modifier: Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,) {
        Row {
            Icon(
                Icons.Rounded.Call,
                null
            )
            Text(
                text = "+1 (123) 456-7890",
                modifier = modifier
            )
        }
        Row {
            Icon(
                Icons.Rounded.AccountCircle,
                null
            )
            Text(
                text = "@urshifuhater#1",
                modifier = modifier
            )
        }
        Row {
            Icon(Icons.Rounded.Email,
                null)

            Text(
                text = "gameon@gmail.com",
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BijinesuCardTheme {
        Card("Android")
    }
}
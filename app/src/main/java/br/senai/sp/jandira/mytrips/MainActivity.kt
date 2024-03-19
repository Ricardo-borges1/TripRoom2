package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.LocalFlorist
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Card (
            modifier = Modifier.size(width = 600.dp, height = 240.dp),
            shape = RectangleShape
        ) {

            Image(painter = painterResource(id = R.drawable.rectangle17),
                contentDescription = "background",
                Modifier.size(width = 550.dp, height = 350.dp),
                contentScale = ContentScale.Crop,
                )
        }

        Image(painter = painterResource(id = R.drawable.user),
            contentDescription = "user",
            modifier
                .size(width = 60.dp, height = 50.dp)
                .offset(x = 320.dp, y = -220.dp)
        )

        Text(text = "Susanna Hoffs",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.offset( x = 270.dp, y = -220.dp)
            )

        Icon(imageVector = Icons.Filled.LocationOn, contentDescription = "",
            tint = Color.White,
            modifier = Modifier
                .offset(x = 15.dp, y = -140.dp)
                .size(32.dp)
            )
        Text(text = "You're in Paris",
            modifier = Modifier.offset(x = 50.dp, y = -165.dp),
            color = Color.White,
            fontWeight = FontWeight.ExtraBold
            )
        Text(text = "My Trips",
            modifier = Modifier.offset(x = 20.dp, y = -170.dp),
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp
        )

        Text(text = "Categories",
            modifier = modifier.offset(x = 30.dp, y = -150.dp),
            color = Color.Gray,
            fontWeight = FontWeight.Bold
            )

    }

    LazyRow(){
        items(1){

            Card (
                modifier = Modifier
                    .width(120.dp)
                    .offset(x = 20.dp, y = 300.dp)
                    .padding(3.dp)
                    .height(80.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xF5C417E2)),
            ) {

                Icon(imageVector = Icons.Filled.LocalFlorist, contentDescription = "",
                    modifier = Modifier.offset(x = 45.dp, y = 15.dp),
                    tint = Color.White
                )
                Text(text = "Mountain",
                fontSize = 20.sp,
                    modifier = Modifier.offset(x = 12.dp, y = 20.dp),
                    color = Color.White
                    )
            }

            Card (
                modifier = Modifier
                    .width(120.dp)
                    .offset(x = 20.dp, y = 300.dp)
                    .padding(3.dp)
                    .height(80.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xF5DC85EB)),
            ) {

                Icon(imageVector = Icons.Filled.Snowboarding, contentDescription = "",
                    modifier = Modifier.offset(x = 45.dp, y = 15.dp),
                    tint = Color.White
                )
                Text(text = "Snow",
                    fontSize = 20.sp,
                    modifier = Modifier.offset(x = 32.dp, y = 20.dp),
                    color = Color.White
                )
            }

            Card (
                modifier = Modifier
                    .width(120.dp)
                    .offset(x = 20.dp, y = 300.dp)
                    .padding(3.dp)
                    .height(80.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xF5DF77F1)),
            ) {

                Icon(imageVector = Icons.Filled.BeachAccess, contentDescription = "",
                    modifier = Modifier.offset(x = 45.dp, y = 15.dp),
                    tint = Color.White
                )
                Text(text = "Beach",
                    fontSize = 20.sp,
                    modifier = Modifier.offset(x = 30.dp, y = 20.dp),
                    color = Color.White
                )
            }
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripsTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("")
        }

    }
}
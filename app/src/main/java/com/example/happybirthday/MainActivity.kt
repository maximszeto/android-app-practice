package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ButtonExample()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun ButtonExample() {
    var clicks by remember { mutableIntStateOf(10) }
    Card() {
        Column(
            modifier = Modifier.padding(32.dp).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(text = "Clicks: $clicks ")

            Button(
                onClick = {
                    clicks--
                }
            ) {
                Text("Add me")
            }
            Text("hey its me verity")

            Card() {
                Row(
                    modifier = Modifier.padding(50.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("hey")
                    Text(" Maxim are")
                    Text(" You")
                }
            }
        }
    }
}

@Composable
fun RowExample() {
    Text("Hey")
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Maxim's App")
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        ButtonExample()
    }
}

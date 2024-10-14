package com.example.a1014

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a1014.ui.theme._1014Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _1014Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "倪培睿",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //var x:Int = 0
    var x by remember { mutableStateOf(0) }
    Column {
        Row {
            Button(
                modifier = modifier,
                onClick = {
                    x = 0
                }
            ) {
                Text("歸零")
                Image(

                    painter = painterResource(id = R.drawable.bts3),
                    contentDescription = "bts團照",
                    modifier = modifier.size(30.dp)
                )
            }
            Button(
                modifier = modifier,
                onClick = {
                    x *= 2
                }
            ) {
                Text("兩倍")
                Image(

                    painter = painterResource(id = R.drawable.bts3),
                    contentDescription = "bts團照",
                    modifier = modifier.size(30.dp)
                )
            }

            Text(text = x.toString(),
                fontSize = 50.sp,
                modifier = modifier.clickable { x++ }
                )


        }
        Text(
            text = stringResource(R.string.author),
            color = Color.Magenta,
            fontSize = 40.sp,
            fontFamily = FontFamily(Font(R.font.sindy)),

            )
        Row {


            Image(

                painter = painterResource(id = R.drawable.bts),

                contentDescription = "bts團照",
                modifier = modifier.size(100.dp)

            )
        }
        Box(

            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center

        ) {

            Image(

                painter = painterResource(id = R.drawable.bts1),

                contentDescription = "bts團照",
                modifier = modifier.clip(CircleShape)

            )
        }
    }

}

    @Composable
    fun GreetingPreview() {
        _1014Theme {
            Greeting("Android")
        }
    }


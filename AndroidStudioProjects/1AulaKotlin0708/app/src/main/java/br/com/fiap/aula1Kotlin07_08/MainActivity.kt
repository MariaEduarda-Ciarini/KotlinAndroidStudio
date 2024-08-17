package br.com.fiap.aula1Kotlin07_08

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.fiap.aula1Kotlin07_08.ui.theme._1AulaKotlin0708Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _1AulaKotlin0708Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {

        Text(
            text = "Aqui o $name!",
            modifier = modifier,
            fontSize = 32.sp,
            color = Color.Cyan
        )
        Text(text = "Estudando Android")
        Button(onClick = {  }) {

        Column{

            Text(text = "Click over here")
            Text(text = "Click over here")

        }
    }
}
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    _1AulaKotlin0708Theme {
        Column {
            Greeting("PC VAI EXPLODIR")
            Greeting("PC VAI EXPLODIR")
        }

    }
}
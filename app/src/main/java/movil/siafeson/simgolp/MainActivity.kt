package movil.siafeson.simgolp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import movil.siafeson.simgolp.ui.theme.SimgolpTheme
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimgolpTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    elements()
                }
            }
        }
    }
}
@Composable
fun elements(){
    Column(
        modifier =  Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.icon),
            contentDescription = "Icon"
        )
        Text("Mascota Feliz",
            color = Color.Blue,
            fontSize = 58.sp
        )
        Text("Bienvenido Usuario")
        Row() {
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Tu mascota")
            }
            Spacer(modifier = Modifier.width(10.dp))
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Contenidos")
            }
        }
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview(){
    SimgolpTheme {
        elements()
    }
}





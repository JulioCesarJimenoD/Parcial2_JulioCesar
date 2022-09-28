package JulioCesar.com

import JulioCesar.com.ui.articuloScreen.ConsultaScreen
import JulioCesar.com.ui.articuloScreen.EntidadScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import JulioCesar.com.ui.theme.Pacial1_JulioTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pacial1_JulioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "ConsultaEntityScreen") {
                        composable(route = "ConsultaEntityScreen") {
                            ConsultaScreen(navHostController = navController)
                        }
                        composable(route = "EntityScreen") {
                            EntidadScreen(navHostController = navController)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Pacial1_JulioTheme {
        Greeting("Android")
    }
}
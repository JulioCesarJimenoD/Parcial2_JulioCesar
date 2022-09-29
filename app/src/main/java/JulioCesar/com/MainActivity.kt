package JulioCesar.com


import JulioCesar.com.ui.articuloScreen.ConsutaArticuloScreen
import JulioCesar.com.ui.articuloScreen.RegistroArticuloScreen
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
import JulioCesar.com.util.Screen
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
                    MyApp()
                }
            }
        }
    }
}


@Composable
fun MyApp() {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController,
        startDestination = Screen.ConsultaArticuloScreen.route){

        composable(route = Screen.ConsultaArticuloScreen.route){
            ConsutaArticuloScreen(goToRegistro = {navHostController.navigate(Screen.RegistroArticuloScreen.route)})
        }

        composable(route = Screen.RegistroArticuloScreen.route){
            RegistroArticuloScreen(backToListado = {navHostController.navigate(Screen.ConsultaArticuloScreen.route)})
        }
    }
}

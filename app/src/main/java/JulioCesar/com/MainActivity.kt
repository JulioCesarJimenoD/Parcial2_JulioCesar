package JulioCesar.com


import JulioCesar.com.ui.articuloScreen.ConsultaArticuloScreen
import JulioCesar.com.ui.articuloScreen.RegistroArticuloScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import JulioCesar.com.ui.theme.Pacial1_JulioTheme
import JulioCesar.com.util.Screen
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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
        startDestination = Screen.ConsultaScreen.route){

        composable(route = Screen.ConsultaScreen.route){
            ConsultaArticuloScreen(goToRegistro = {navHostController.navigate(Screen.RegistroScreen.route)})
        }

        composable(route = Screen.RegistroScreen.route){
            RegistroArticuloScreen(backToConsulta = { navHostController.navigate(Screen.ConsultaScreen.route) })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Pacial1_JulioTheme {
        MyApp()
    }
}

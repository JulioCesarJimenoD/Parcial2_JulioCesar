package JulioCesar.com.ui.articuloScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun EntidadScreen(navHostController: NavHostController,
                  viewModel: ArticuloViewModel = hiltViewModel()
){
        Column(modifier = Modifier.fillMaxSize()) {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = "Registro de Entityes") }
                    )
                }
            ) {
                Column(
                    modifier = Modifier
                        .padding(it)
                        .padding(8.dp)
                ) {
                    OutlinedButton(onClick = {
                        navHostController.navigateUp()
                    }) {
                        Text(text = "Guardar")
                    }
                }
            }
        }
}
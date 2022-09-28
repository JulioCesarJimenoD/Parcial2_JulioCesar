package JulioCesar.com.ui.articuloScreen

import JulioCesar.com.data.articulos.Articulo
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
@Composable
fun ConsutaArticuloScreen(goToRegistro:() -> Unit, viewModel: ArticuloViewModel = hiltViewModel()) {
    val ScaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Consulta") })
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    goToRegistro()
                },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Nuevo")
            }
        },
        scaffoldState = ScaffoldState

    ) { it
        val Listarticulo = viewModel.articulo.collectAsState(initial = emptyList())
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()){


            items(Listarticulo.value){articulo ->

                Column(modifier = Modifier.fillMaxWidth())
                {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(30.dp).padding(vertical = 2.dp),
                        horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "${articulo.marca}")

                        Text(text = "${articulo.descripcion}",
                            style = MaterialTheme.typography.h5)
                    }
                    Row( modifier = Modifier.fillMaxWidth().padding(vertical = 1.dp),
                        horizontalArrangement = Arrangement.Start){
                        Text(text = "${articulo.existencias}",
                            style = MaterialTheme.typography.caption)
                    }
                }
            }
        }
    }
}

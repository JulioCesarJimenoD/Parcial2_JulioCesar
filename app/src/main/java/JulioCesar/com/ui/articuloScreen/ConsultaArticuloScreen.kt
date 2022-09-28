package JulioCesar.com.ui.articuloScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun ConsultaScreen(navHostController: NavHostController, viewModel: ArticuloViewModel = hiltViewModel()){


    Column(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "Consulta de Entityes") }
                )
            },
            floatingActionButton = {
                FloatingActionButton(onClick = { navHostController.navigate("EntityScreen") }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = null)
                }
            }

        ){
            Column(
                modifier = Modifier
                    .padding(it)
                    .padding(8.dp)
            ) {
                //val lista = viewModel.entityes.collectAsState(initial = emptyList())

                LazyColumn(modifier = Modifier.fillMaxWidth()) {
                    item {
                        Row() {
                            Text(
                                text = "EntityId"
                            )
                            Text(
                                text = "Nombre"
                            )
                        }
                    }
//                    items(lista.value) {
//                        Row() {
//                            Text(
//                                text = it.EntityId.toString()
//                            )
//                            Text(
//                                text = it.Nombre
//                            )
//                        }
//                    }
                }
            }
        }
    }
}
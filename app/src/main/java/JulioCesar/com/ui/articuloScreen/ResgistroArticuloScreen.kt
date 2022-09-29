package JulioCesar.com.ui.articuloScreen

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun RegistroArticuloScreen (backToConsulta:() -> Unit,
                            viewModel: ArticuloViewModel = hiltViewModel(),
                            articuloId: Int = 0){
    val ScaffoldState = rememberScaffoldState()

    var validarMarca by remember{ mutableStateOf(false) }
    var validarDescripcion by remember{ mutableStateOf(false) }
    var validarExistenacias by remember{ mutableStateOf(false) }
    val context = LocalContext.current



    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Registro") })
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    validarMarca = viewModel.marca.isBlank()
                    validarDescripcion = viewModel.descripcion.isBlank()
                    validarExistenacias = viewModel.existencias.isBlank()

//                    validarExistenacias = viewModel.existencias.isBlank()

                    if(viewModel.marca== ""){
                        Toast.makeText(context, "La Marca no debe estar vacio", Toast.LENGTH_SHORT).show()
                    }

                    if(viewModel.descripcion == ""){
                        Toast.makeText(context, "La descripcion no debe estar vacia", Toast.LENGTH_SHORT).show()
                    }

                    if(viewModel.existencias == ""){
                        Toast.makeText(context, "La existencias no debe estar vacio y debe de ser mayor a 0", Toast.LENGTH_SHORT).show()
                    }else{
                        if(!viewModel.existencias.isDigitsOnly()){
                            Toast.makeText(context, "No puedes escribir letras", Toast.LENGTH_SHORT).show()
                        }
                    }

                    if(!validarMarca&& !validarDescripcion && !validarExistenacias){
                        if(viewModel.existencias.isDigitsOnly() && viewModel.existencias.toDouble() > 0.0){
                            viewModel.Guardar()
                            Toast.makeText(context, "Guardado", Toast.LENGTH_SHORT).show()
                            backToConsulta()
                        }else{
                            Toast.makeText(context, "El sueldo debe de ser mayor a 0", Toast.LENGTH_SHORT).show()
                        }
                    }
                },
                backgroundColor = MaterialTheme.colors.primary
            ) {
              //  Icon(imageVector = Icons.Default.SaveAs, contentDescription = "Nuevo")
            }
        },
        scaffoldState = ScaffoldState

    ){it

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {

            TextField(
                value = viewModel.marca,
                onValueChange = {viewModel.marca = it} ,
                label = { Text(text = "Marca")},
                modifier = Modifier.fillMaxWidth(),
                //leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription ="") }

            )
            TextField(
                value = viewModel.descripcion,
                onValueChange = {viewModel.descripcion = it} ,
                label = { Text(text = "descripcion")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
     //           leadingIcon = { Icon(imageVector = Icons.Default.Streetview, contentDescription ="") }

            )
            TextField(
                value = viewModel.existencias,
                onValueChange = {viewModel.existencias = it},
            label = { Text(text = "existencias")},
            modifier = Modifier.fillMaxWidth())


            TextField(
                value = viewModel.existencias,
                onValueChange = {viewModel.existencias = it} ,
                label = { Text(text = "Existencias")},
                modifier = Modifier.fillMaxWidth(),
              //  leadingIcon = { Icon(imageVector = Icons.Default., contentDescription ="") }

            )
        }
    }
}


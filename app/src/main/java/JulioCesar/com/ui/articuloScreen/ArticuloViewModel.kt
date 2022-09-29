package JulioCesar.com.ui.articuloScreen

import JulioCesar.com.data.articulos.Articulo
import JulioCesar.com.data.repository.ArticuloRepository
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ArticuloViewModel @Inject constructor(
    val articuloRepository: ArticuloRepository
):ViewModel(){
    var marca by mutableStateOf("")
    var descripcion by mutableStateOf("")
    var existencias by mutableStateOf("")
    var articulo = articuloRepository.getList()
        private set


    fun Guardar(){
        viewModelScope.launch {
            articuloRepository.Insertar(
                Articulo(
                    articuloId = 0,
                    descripcion = "",
                    marca = "",
                    existencias = 0.0
            )
            )
        }
    }
}


package JulioCesar.com.data.repository

import JulioCesar.com.data.articulos.Articulo
import JulioCesar.com.data.dao.ArticulosDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class ArticuloRepository @Inject constructor(
    val articulosDao: ArticulosDao
){
    suspend fun Insertar( articulo: Articulo) = articulosDao.Insertar(articulo)

    fun getList(): Flow<List<Articulo>> = articulosDao.getList()
}


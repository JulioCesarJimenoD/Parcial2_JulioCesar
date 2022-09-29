package JulioCesar.com.data.repository

import JulioCesar.com.data.ArticuloDatabase
import JulioCesar.com.data.articulos.Articulo
import JulioCesar.com.data.dao.ArticulosDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class ArticuloRepository @Inject constructor(
    val db:ArticuloDatabase
){
    suspend fun Insertar( articulo: Articulo) = db.ArticulosDao.Insertar(articulo)

    fun getList(): Flow<List<Articulo>> = db.ArticulosDao.getList()
}


package JulioCesar.com.data.dao

import JulioCesar.com.data.articulos.Articulo
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticulosDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun Insertar(articulo: Articulo)

    @Delete
    suspend fun Eliminar(articulo: Articulo)

    @Update
    suspend fun Modificar(articulo: Articulo)

    @Query(
        "SELECT * FROM Articulos ORDER BY articuloId "
    )
    fun getList(): Flow<List<Articulo>>


}

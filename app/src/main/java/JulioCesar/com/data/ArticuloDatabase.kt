package JulioCesar.com.data

import JulioCesar.com.data.articulos.Articulo
import JulioCesar.com.data.dao.ArticulosDao
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Articulo::class],
    exportSchema = false,
    version = 2
)
abstract class ArticuloDatabase : RoomDatabase(){
    abstract val ArticulosDao : ArticulosDao

}

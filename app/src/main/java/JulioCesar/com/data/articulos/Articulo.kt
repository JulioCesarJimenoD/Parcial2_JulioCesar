package JulioCesar.com.data.articulos

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Articulos")
data class Articulo(
    @PrimaryKey(autoGenerate = true)
    val articuloId: Int,
    val descripcion: String,
    val marca: String,
    val existencias: Double
)

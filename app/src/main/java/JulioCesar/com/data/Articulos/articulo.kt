package JulioCesar.com.data.Articulos

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Articulo")
data class articulo(
    @PrimaryKey(autoGenerate = true)
    val articuloId: Int,
    val descripcion: String,
    val marca: String,
    val existencias: Double
)

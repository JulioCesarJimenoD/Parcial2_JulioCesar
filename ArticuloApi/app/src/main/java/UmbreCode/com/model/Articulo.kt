package UmbreCode.com.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Articulos")
data class Articulo(
    @PrimaryKey(autoGenerate = true)
    val articuloId: Int,
    val marca: String,
    val descripcion: String,
    val existencias: Double
)

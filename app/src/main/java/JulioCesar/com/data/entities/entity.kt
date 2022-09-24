package JulioCesar.com.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Entidad")
data class entity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val valor1: String,
    val valor2: String,
    val valor3: Double
)

package JulioCesar.com.data

import JulioCesar.com.data.entities.entity
import androidx.room.Database

@Database(
    entities = [entity::class],
    exportSchema = false,
    version = 1
)
abstract class AppDatabase {
    //Los Daos van aqui!!

}
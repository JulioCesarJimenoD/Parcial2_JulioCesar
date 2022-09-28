package JulioCesar.com.data

import JulioCesar.com.data.entities.entity
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [entity::class],
    exportSchema = false,
    version = 2
)
abstract class AppDatabase : RoomDatabase(){
    //Los Daos van aqui!!

}
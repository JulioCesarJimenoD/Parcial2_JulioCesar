package JulioCesar.com.di

import JulioCesar.com.data.ArticuloDatabase
import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides

    fun provideDatabase(@ApplicationContext context: Context) : ArticuloDatabase{
        return Room.databaseBuilder(
            context,
            ArticuloDatabase::class.java,"Articulos.db"
        ).fallbackToDestructiveMigration()
            .build()
    }

}
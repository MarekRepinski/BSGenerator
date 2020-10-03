package se.ctescape.bsgenerator.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BSphrases::class], version = 1, exportSchema = false)
abstract class BSphrasesDatabase: RoomDatabase() {
    abstract fun BSphrasesDAO(): BSphrasesDAO

    companion object {
        @Volatile private var INSTANCE : BSphrasesDatabase? = null

        fun getDatabase(context: Context) : BSphrasesDatabase{
            val tempINSTANCE = INSTANCE
            if (tempINSTANCE != null){
                return tempINSTANCE
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BSphrasesDatabase::class.java,
                    "bs_phrases_database"
                ).build()
                INSTANCE = instance
                return  instance
            }

        }
    }
}
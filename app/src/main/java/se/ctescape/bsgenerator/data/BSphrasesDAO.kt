package se.ctescape.bsgenerator.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BSphrasesDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addBS(bs: BSphrases)

    @Update
    suspend fun updateBS(bs: BSphrases)

    @Delete
    suspend fun deleteBS(bs: BSphrases)

    @Query("DELETE FROM bs_phrases_table")
    suspend fun deleteAllBS()

    @Query("SELECT * FROM bs_phrases_table ORDER BY id ASC")
    suspend fun readAllData(): List<BSphrases>

    @Query("SELECT COUNT(*) FROM bs_phrases_table")
    suspend fun getCount(): Int
}
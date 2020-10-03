package se.ctescape.bsgenerator.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "bs_phrases_table")
data class BSphrases (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val word0: String,
    val word1: String,
    val word2: String,
    val word3: String,
    val word4: String,
    val word5: String,
    val word6: String,
    val word7: String,
)
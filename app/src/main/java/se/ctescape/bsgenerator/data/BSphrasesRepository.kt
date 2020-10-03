package se.ctescape.bsgenerator.data

import androidx.lifecycle.LiveData

class BSphrasesRepository(private val bSphrasesDAO: BSphrasesDAO) {
    suspend fun getAllData(): List<BSphrases>{
        return bSphrasesDAO.readAllData()
    }

    suspend fun addBS(bs: BSphrases) {
        bSphrasesDAO.addBS(bs)
    }

    suspend fun updateBS(bs: BSphrases) {
        bSphrasesDAO.updateBS(bs)
    }

    suspend fun deleteBS(bs: BSphrases) {
        bSphrasesDAO.deleteBS(bs)
    }

    suspend fun deleteAllBS() {
        bSphrasesDAO.deleteAllBS()
    }

    suspend fun getCount(): Int {
        return bSphrasesDAO.getCount()
    }
}
package se.ctescape.bsgenerator.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BSphrasesViewModel(application: Application): AndroidViewModel(application) {
//    val readAllData : LiveData<List<BSphrases>>
    private val repository : BSphrasesRepository

    init {
        val bSphrasesDAO = BSphrasesDatabase.getDatabase(application).BSphrasesDAO()
        repository = BSphrasesRepository(bSphrasesDAO)
//        readAllData = repository.getAllData()
    }

    fun addBS(bs : BSphrases){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addBS(bs)
        }
    }

    fun updateBS(bs : BSphrases){
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateBS(bs)
        }
    }

    fun deleteBS(bs : BSphrases){
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteBS(bs)
        }
    }

    fun deleteAllBS(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAllBS()
        }
    }
}
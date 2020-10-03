package se.ctescape.bsgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import se.ctescape.bsgenerator.data.BSphrasesDatabase
import se.ctescape.bsgenerator.data.BSphrasesRepository
import se.ctescape.bsgenerator.data.BSphrasesViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    val list0 = mutableListOf<String>()
    val list1 = mutableListOf<String>()
    val list2 = mutableListOf<String>()
    val list3 = mutableListOf<String>()
    val list4 = mutableListOf<String>()
    val list5 = mutableListOf<String>()
    val list6 = mutableListOf<String>()
    val list7 = mutableListOf<String>()
    lateinit var dbFill: FilldataBase
    var listFilled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbFill = FilldataBase(this)

        buildLists()
        getNewBS()

        bs_btn.setOnClickListener {
            getNewBS()
        }
    }

    fun getNewBS() {
        CoroutineScope(IO).launch {
            var timeLimit = 0
            while (!listFilled && timeLimit < 20) {
                delay(500)
                timeLimit++
            }

            if (timeLimit < 20 && list0.size > 0) {
                var tempStr = list0[(0..list0.size - 1).random()]
                tempStr += list1[(0..list1.size - 1).random()]
                tempStr += list2[(0..list2.size - 1).random()]
                tempStr += list3[(0..list3.size - 1).random()]
                tempStr += list4[(0..list4.size - 1).random()]
                tempStr += list5[(0..list5.size - 1).random()]
                tempStr += list6[(0..list6.size - 1).random()]
                tempStr += list7[(0..list7.size - 1).random()]
                withContext(Main){//Funkar bara från coroutines
                    bs_main_txt.text = tempStr
                }
            }
        }
    }

    fun buildLists() {
        val contex = this
        CoroutineScope(IO).launch {
            println("AIK!! BuildList ${dbFill.finished}")
            var timeLimit = 0
            while (!dbFill.finished && timeLimit < 20) {
                delay(500)
                timeLimit++
            }

            if (timeLimit < 20) {
                println("AIK!! BuildList filling lists ${dbFill.finished}")
                val repository: BSphrasesRepository =
                    BSphrasesRepository(BSphrasesDatabase.getDatabase(contex).BSphrasesDAO())
                CoroutineScope(IO).launch {
                    val list = repository.getAllData()
                    list.forEach {
                        list0.add(it.word0)
                        list1.add(it.word1)
                        list2.add(it.word2)
                        list3.add(it.word3)
                        list4.add(it.word4)
                        list5.add(it.word5)
                        list6.add(it.word6)
                        list7.add(it.word7)
                    }
                }
            } else {
                Toast.makeText(contex, "Loading database is taking too long", Toast.LENGTH_LONG)
            }
            listFilled = true
        }
    }
}
package se.ctescape.bsgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import se.ctescape.bsgenerator.data.BSphrasesDatabase
import se.ctescape.bsgenerator.data.BSphrasesRepository
import se.ctescape.bsgenerator.data.BSphrasesViewModel

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    val list0 = mutableListOf<String>()
    val list1 = mutableListOf<String>()
    val list2 = mutableListOf<String>()
    val list3 = mutableListOf<String>()
    val list4 = mutableListOf<String>()
    val list5 = mutableListOf<String>()
    val list6 = mutableListOf<String>()
    val list7 = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mViewModel = ViewModelProvider(this).get(BSphrasesViewModel::class.java)

        FilldataBase(this)
        buildLists()
//        textView = find

    }

    override fun onStart() {
        super.onStart()
    }

    fun getNewBS(){

    }

    fun buildLists(){
        val repository : BSphrasesRepository = BSphrasesRepository(BSphrasesDatabase.getDatabase(this).BSphrasesDAO())
        CoroutineScope(IO).launch {
            val list = repository.getAllData()
            list.forEach{
                println("AIK!! $it")
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
    }
}
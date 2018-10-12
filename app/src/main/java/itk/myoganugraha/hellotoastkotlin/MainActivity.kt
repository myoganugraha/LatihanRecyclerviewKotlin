package itk.myoganugraha.hellotoastkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listTitle = arrayOf("Title Pertama", "Title Kedua", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8")
    var listDetail = arrayOf("Detail pertama", "Detail Kedua", "Detail 3", "Detail 4", "Detail 5", "Detail 6", "Detail 7", "Detail 8")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_main?.setHasFixedSize(true)
        recyclerView_main?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val listData = ArrayList<Model>()

        for (i in 0 until listTitle.size){
            listData.add(Model(listTitle[i], listDetail[i]))
        }

        var adapter = Adapter(this, listData)
        recyclerView_main?.adapter = adapter


    }
}

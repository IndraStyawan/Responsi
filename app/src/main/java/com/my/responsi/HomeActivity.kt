package com.my.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    lateinit var rcview: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        init()
        rcview.layoutManager = LinearLayoutManager(this)
        rcview.adapter = adapter
    }

    private fun init(){
        rcview = findViewById(R.id.rcview)

        var list = ArrayList<ListBuku>()
        list.add(ListBuku(R.drawable.pd,"Pemrograman Dasar","Mardi Turnip, Abdi Dharma"))
        list.add(ListBuku(R.drawable.pad,"Pemrograman Android dan Database","Abdul Kadir"))
        list.add(ListBuku(R.drawable.flutter,"Pengantar Pemrograman Dart dan Flutter","Jubilee Enterprice"))
        list.add(ListBuku(R.drawable.py,"Otodidak Pemrograman Python","Jubilee Enterprice"))

        adapter = MyAdapter(list)
    }
}
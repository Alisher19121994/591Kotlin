package com.example.a591kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var main_recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        main_recyclerView = findViewById(R.id.main_RecyclerView)
        main_recyclerView.layoutManager = GridLayoutManager(this, 1)

        getMainAdapter(data())
    }

    private fun data(): ArrayList<Main> {

        val mainList = ArrayList<Main>()
        val feeds = ArrayList<Feeds>()

        mainList.add(Main())
        mainList.add(Main(feeds))

        feeds.add(Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"))
        feeds.add(Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"))
        feeds.add(Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"))
        feeds.add(Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"))
        feeds.add(Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"))
        feeds.add(Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"))
        feeds.add(Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"))
        feeds.add(Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"))


        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))
        mainList.add(Main(Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)))

        return mainList
    }

    private fun getMainAdapter(list: ArrayList<Main>) {
        val adapter = MainAdapter(this, list)
        main_recyclerView.adapter = adapter
    }
}
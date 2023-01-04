package com.example.workshopmobilecontoh

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.workshopmobilecontoh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding : ActivityMainBinding by viewBinding()
    private val list : ArrayList<Fish> = arrayListOf()
    private lateinit var listFishAdapter: ListFishAdapter




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvMusicians.setHasFixedSize(true)
        list.addAll(FishData.listData)
        binding.aboutMePageButton.setOnClickListener {
            val intent = Intent(binding.aboutMePageButton.context, AboutMeActivity::class.java)
            binding.aboutMePageButton.context.startActivity(intent)
        }
        showRecyclerViewList()
    }

    private fun showRecyclerViewList() {
        binding.apply {
            rvMusicians.layoutManager = LinearLayoutManager(this@MainActivity)
            listFishAdapter = ListFishAdapter(list)
            rvMusicians.adapter = listFishAdapter
        }
    }

}
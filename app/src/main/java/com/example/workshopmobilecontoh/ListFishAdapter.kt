package com.example.workshopmobilecontoh

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

import com.example.workshopmobilecontoh.databinding.ItemRowsBinding

class ListFishAdapter(private val list : ArrayList<Fish>) :
    RecyclerView.Adapter<ListFishAdapter.ListViewHolder>() {
        inner class ListViewHolder (private val binding : ItemRowsBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(fish: Fish){
                with(binding){
                    tvFishName.text = fish.name
                    tvFishDesc.text = fish.detail
                    Glide.with(itemView.context)
                        .load(fish.photo)
                        .apply(RequestOptions().override(260, 260))
                        .into(fishPhoto)
                    itemView.setOnClickListener {
                        val intent = Intent(itemView.context, DetailActivity::class.java)
                        intent.putExtra(DetailActivity.EXTRA_DETAIL, fish)
                        itemView.context.startActivity(intent)

                    }
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowsBinding.inflate((LayoutInflater.from(parent.context)), parent,false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = list[position]

        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
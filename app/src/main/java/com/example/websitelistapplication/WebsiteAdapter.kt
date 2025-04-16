package com.example.websitelistapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.websitelistapplication.databinding.ItemWebsiteBinding

class WebsiteAdapter(private var websites: List<Website>) :
    RecyclerView.Adapter<WebsiteAdapter.WebsiteViewHolder>() {

    class WebsiteViewHolder(private val binding: ItemWebsiteBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(website: Website) {
            binding.name.text = website.name
            binding.description.text = website.description
            binding.icon.load(website.icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WebsiteViewHolder {
        val binding = ItemWebsiteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WebsiteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WebsiteViewHolder, position: Int) {
        holder.bind(websites[position])
    }

    override fun getItemCount(): Int = websites.size

    fun updateData(newWebsites: List<Website>) {
        websites = newWebsites
        notifyDataSetChanged()
    }
}
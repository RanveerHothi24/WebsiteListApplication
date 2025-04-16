package com.example.websitelistapplication

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.websitelistapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: WebsiteViewModel by viewModels()
    private lateinit var adapter: WebsiteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        observeViewModel()

        viewModel.fetchWebsites()

        binding.sortButton.setOnClickListener {
            viewModel.sortWebsitesByName()
        }
    }

    private fun setupRecyclerView() {
        adapter = WebsiteAdapter(emptyList())
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = this@MainActivity.adapter
        }
    }

    private fun observeViewModel() {
        viewModel.websites.observe(this) { websites ->
            adapter.updateData(websites)
        }
        viewModel.error.observe(this) { error ->
            // Handle error (e.g., show Toast)
        }
    }
}
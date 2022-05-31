package com.example.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myfirstapp.databinding.ActivityDisplayMessageBinding

class DisplayMessageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDisplayMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setArchitectureComponents()
        initializeUI()
    }

    private fun setArchitectureComponents() {
        // Inflate view and obtain an instance of the binding class.
        binding = DataBindingUtil.setContentView(this, R.layout.activity_display_message)
    }

    private fun initializeUI() {
        binding.apply {
            textView.text = intent.getStringExtra(EXTRA_MESSAGE)
        }
    }
}
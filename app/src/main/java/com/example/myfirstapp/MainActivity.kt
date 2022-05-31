package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.myfirstapp.databinding.ActivityMainBinding

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setArchitectureComponents()
        initializeUI()
    }

    private fun setArchitectureComponents() {
        // Inflate view and obtain an instance of the binding class.
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    private fun initializeUI() {
        binding.apply {
            button.setOnClickListener {
                binding.root.findFocus().clearFocus()
                val message = editTextTextPersonName.text.toString()
                val intent = Intent(this@MainActivity, DisplayMessageActivity::class.java).apply {
                    putExtra(EXTRA_MESSAGE, message)
                }
                startActivity(intent)
            }
        }
    }
}
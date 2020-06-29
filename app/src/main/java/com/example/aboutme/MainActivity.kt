package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.MylayoutBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MylayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.mylayout)

//        findViewById<Button>(R.id.doneButton).setOnClickListener {
//            addNickname(it)
//
//        }
        binding.doneButton.setOnClickListener {
            addNickname(it)
        }
    }

    fun addNickname(view: View){
        binding.textView2.text = binding.nicknameInput.text.toString()
        invalidateAll()
        binding.textView2.visibility = View.VISIBLE
        binding.nicknameInput.visibility = View.GONE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
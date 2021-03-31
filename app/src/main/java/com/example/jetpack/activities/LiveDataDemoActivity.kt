package com.example.jetpack.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jetpack.R
import com.example.jetpack.fragments.DisplayDataFragment

class LiveDataDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data_demo)

        addFragmentToView()
    }

   //add fragment
    private fun addFragmentToView() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer_FL, DisplayDataFragment())
        fragmentTransaction.commit()
    }
}
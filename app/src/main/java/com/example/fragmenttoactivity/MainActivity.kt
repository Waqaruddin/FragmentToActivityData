package com.example.fragmenttoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BlankFragment.OnFragmentInteraction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        supportFragmentManager?.beginTransaction()?.add(R.id.fragment_container, BlankFragment())?.commit()
    }

    override fun onButtonClicked(name: String) {
        text_view_name.text = name
    }
}
package com.lucasfarias.workouttracker

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.homeItem -> {
                    toast("Home clicked")
                    bottomNavView.menu.findItem(R.id.homeItem).isChecked = true
                }
                R.id.historyItem -> {
                    toast("History clicked")
                    bottomNavView.menu.findItem(R.id.historyItem).isChecked = true
                }
                R.id.settingsItem -> {
                    toast("Settings clicked")
                    bottomNavView.menu.findItem(R.id.settingsItem).isChecked = true
                }
                else -> {
                    TODO("Do nothing")
                }
            }
            false
        }
    }
}


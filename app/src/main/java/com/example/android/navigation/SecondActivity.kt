package com.example.android.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class SecondActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        navController = findNavController(R.id.nav_sec_fragment)

        appBarConfiguration = AppBarConfiguration(
                setOf(R.id.historyFragment, R.id.profileFragment))

        setUpBottomNav(navController)

    }

    fun setUpBottomNav(navController: NavController) {
        NavigationUI.setupWithNavController(findViewById<BottomNavigationView>(R.id.bottom_nav_view), navController)
    }

    override fun onSupportNavigateUp(): Boolean {

        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }


}

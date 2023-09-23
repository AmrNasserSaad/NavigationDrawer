package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout:DrawerLayout = findViewById(R.id.drawerLayout)
        val nayView:NavigationView = findViewById(R.id.nav_view)

        toggle =  ActionBarDrawerToggle(this,drawerLayout,R.string.open ,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nayView.setNavigationItemSelectedListener{
            when (it.itemId)
            {
                R.id.home -> { Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()}
                R.id.nav_profile ->  {Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show() }
                R.id.settings ->  { Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show() }
                R.id.share ->  { Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show() }
            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}


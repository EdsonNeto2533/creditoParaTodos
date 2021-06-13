package com.example.creditoParaTodos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class principal : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //referencia o menu na main activity
        var drawerlayout: DrawerLayout = findViewById(R.id.drawer_layout)
        //referencia a toolbar no toolbar.xml
        var tb: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(tb)
        //inicia o navigation view(menu lateral)
        var navview: NavigationView = findViewById(R.id.Nav_View)
        navview.setNavigationItemSelectedListener(this)


        //instancia o sanduiche para o menu de opçoes
        var act: ActionBarDrawerToggle? = null
        act = ActionBarDrawerToggle(this,drawerlayout,tb, R.string.open, R.string.close)
        drawerlayout.addDrawerListener(act)
        act.setDrawerIndicatorEnabled(true)
        act.syncState()


        //fragmento default da mainActivity
        val tx = supportFragmentManager.beginTransaction()
        tx.add(R.id.container_fragment, mainFragment())
        tx.commit()



    }


    //evento de click
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // joga a navbar para esquerda qnd o item for selecionado
        val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
        drawer.closeDrawer(GravityCompat.START)

        if (item.itemId == R.id.homeBTN){
            val tx = supportFragmentManager.beginTransaction()
            tx.replace(R.id.container_fragment, mainFragment())
            tx.commit()
        }

        if (item.itemId == R.id.tela2BTN){
            val tx = supportFragmentManager.beginTransaction()
            tx.replace(R.id.container_fragment, SegundoFragment())
            tx.commit()
        }
        return true
    }



}
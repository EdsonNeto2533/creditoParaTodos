package com.example.drawerlayout

import android.content.Context
import android.net.sip.SipSession
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import java.lang.ClassCastException

//fragmento é uma parte de um layout q eu posso carregar dentro de uma activity
class mainFragment : Fragment() {



    //dando override no oncreate para dizer qual layout de fragmento abrir
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.mainfragment, container, false)
        var BTNMain: Button = view.findViewById(R.id.BTNMainFragment)


        //nao entendi nada mas abre o outro fragmento, amem jesus kkkk
        BTNMain.setOnClickListener {
            val tx = fragmentManager?.beginTransaction()
            if (tx != null) {
                tx.replace(R.id.container_fragment, SegundoFragment())
            }
            if (tx != null) {
                tx.commit()
            }
        }


        return view
    }




}
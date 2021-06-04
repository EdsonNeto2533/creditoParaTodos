package com.example.creditoParaTodos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

//fragmento é uma parte de um layout q eu posso carregar dentro de uma activity
class mainFragment : Fragment() {



    //dando override no oncreate para dizer qual layout de fragmento abrir
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.mainfragment, container, false)
        //var BTNMain: Button = view.findViewById(R.id.BTNMainFragment)



        /*BTNMain.setOnClickListener {
            val tx = fragmentManager?.beginTransaction()
            if (tx != null) {
                tx.replace(R.id.container_fragment, SegundoFragment())
            }
            if (tx != null) {
                tx.commit()
            }
        }

         */


        return view
    }




}
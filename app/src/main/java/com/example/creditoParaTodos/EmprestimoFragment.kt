package com.example.creditoParaTodos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.emprestimo_frag_layout.*

class EmprestimoFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.emprestimo_frag_layout,container,false)


        val check: CheckBox = view.findViewById(R.id.checkemp)
        val contratar: Button = view.findViewById(R.id.btnContratar)


        contratar.setOnClickListener {
            telafinal()
        }

        check.setOnClickListener {
            habilitabtn()
        }


        return view


    }

    // transição via fragmentos
    fun telafinal(){
        val tx = fragmentManager?.beginTransaction()
        if (tx != null) {
            tx.replace(R.id.container_fragment, ConcluidoFragment())
        }
        if (tx != null) {
            tx.commit()
        }
    }

    //habilita ou desabilita o botao contratar
    fun habilitabtn() {
        if (checkemp.isChecked) {
            btnContratar.isEnabled = true
            btnContratar.isClickable = true
        } else {
            btnContratar.isEnabled = false
            btnContratar.isClickable = false
        }
    }
}
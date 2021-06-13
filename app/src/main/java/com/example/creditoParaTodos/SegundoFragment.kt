package com.example.creditoParaTodos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class SegundoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.segundofragment, container, false)

        val btn: Button = view.findViewById(R.id.btn5500)
        val btn2: Button = view.findViewById(R.id.btn2)
        val btn3: Button = view.findViewById(R.id.btn3)

        //eventos de click do fragmento
        btn.setOnClickListener { view ->
            call_emprestimo()
        }

        btn2.setOnClickListener { view ->
            call_emprestimo2()
        }

        btn3.setOnClickListener { view ->
            call_emprestimo3()
        }

        return view
    }

    // chama a primeira tela de emprestimo
    private fun call_emprestimo() {
        val tx = fragmentManager?.beginTransaction()
        if (tx != null) {
            tx.replace(R.id.container_fragment, EmprestimoFragment())
        }
        if (tx != null) {
            tx.commit()
        }
    }

    //chama a segunda tela de emprestimo

    private fun call_emprestimo2(){
        val tx = fragmentManager?.beginTransaction()
        if (tx != null) {
            tx.replace(R.id.container_fragment, EmprestimoFragment2())
        }
        if (tx != null) {
            tx.commit()
        }
    }

    //chama a terceira tela de emprestimo
    private fun call_emprestimo3(){
        val tx = fragmentManager?.beginTransaction()
        if (tx != null) {
            tx.replace(R.id.container_fragment, EmprestimoFragment3())
        }
        if (tx != null) {
            tx.commit()
        }
    }

}
package com.example.mrdoyon.kalkulatorwithmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mrdoyon.kalkulatorwithmvp.Model.MainModel
import com.example.mrdoyon.kalkulatorwithmvp.Presenter.MainPresenter
import com.example.mrdoyon.kalkulatorwithmvp.View.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    var presenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)
    }

    override fun tampilkanHasil(mainModel: MainModel) {
        hasil.text = mainModel.hasil.toString()
    }

    fun hitungHasil(view: View){

        val a1 = angka1.text.toString().toDouble()
        val a2 = angka2.text.toString().toDouble()

        when {
            view.id == R.id.btnTambah -> { presenter?.penjumlahan(a1, a2) }
            view.id == R.id.btnKurang -> { presenter?.pengurangan(a1, a2) }
            view.id == R.id.btnKali -> { presenter?.perkalian(a1, a2) }
            view.id == R.id.btnBagi -> { presenter?.pembagian(a1, a2) }
        }
    }
}

package com.example.mrdoyon.kalkulatorwithmvp.Presenter

import com.example.mrdoyon.kalkulatorwithmvp.Model.MainModel
import com.example.mrdoyon.kalkulatorwithmvp.View.MainView

/**
 * Created by mrdoyon on 1/14/18.
 */
class MainPresenter(var mainView: MainView){

    var hasil: Double? = null

    fun penjumlahan(a: Double, b: Double){
        hasil = a + b
        tampilkan(hasil!!)
    }

    fun pengurangan(a: Double, b: Double){
        hasil = a - b
        tampilkan(hasil!!)
    }

    fun perkalian(a: Double, b: Double){
        hasil = a * b
        tampilkan(hasil!!)
    }

    fun pembagian(a: Double, b: Double){
        hasil = a / b
        tampilkan(hasil!!)
    }

    fun tampilkan(hasil: Double){
        val model = MainModel(hasil)
        mainView.tampilkanHasil(model)
    }
}
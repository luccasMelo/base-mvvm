package com.luccasmelo.basemvvm

import android.arch.lifecycle.ViewModel

public interface  Base{

    fun injectDependencies()
    fun bind()
    fun resourceId(): Int
    fun  viewModel():ViewModel
    fun onCreate()
    fun onRecreate()
}
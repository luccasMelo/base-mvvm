package com.luccasmelo.basemvvm

public interface  Base<T>{

    fun injectDependencies()
    fun bind()
    fun resourceId(): Int
    fun viewModel():Class<T>
    fun onCreate()
    fun onRecreate()
}
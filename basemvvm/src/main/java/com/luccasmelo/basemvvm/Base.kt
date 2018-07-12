package com.luccasmelo.basemvvm

public interface  Base{

    fun injectDependencies()
    fun bind()
    fun resourceId(): Int
    fun <T> viewModel():Class<T>
    fun onCreate()
    fun onRecreate()
}
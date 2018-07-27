package com.luccasmelo.basemvvm

import android.arch.lifecycle.ViewModel
import kotlin.reflect.KClass

public interface Base<T:ViewModel>{

    fun injectDependencies()
    fun bind()
    fun resourceId(): Int
    fun viewModel(): T

    fun onCreate()
    fun onRecreate()
}
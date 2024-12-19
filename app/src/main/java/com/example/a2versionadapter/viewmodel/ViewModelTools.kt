package com.example.a2versionadapter.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.a2versionadapter.model.TheTools
import com.example.a2versionadapter.repository.RepositoryTools


class ViewModelTools (): ViewModel() {
    private val repositoryTools = RepositoryTools()

    private var _toolsList = MutableLiveData<List<TheTools>>()
    val toolsList: LiveData<List<TheTools>> get() = _toolsList

    init {
        updateTools()
    }

    fun updateTools() {
        _toolsList.value = repositoryTools.getListTools()
    }
}
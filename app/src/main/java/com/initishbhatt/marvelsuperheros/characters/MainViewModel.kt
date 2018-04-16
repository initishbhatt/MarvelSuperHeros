package com.initishbhatt.marvelsuperheros.characters

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import com.initishbhatt.marvelsuperheros.characters.model.MarvelSuperHeroes
import com.initishbhatt.marvelsuperheros.interactor.MarvelInteractor
import com.initishbhatt.marvelsuperheros.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.subscribeBy
import timber.log.Timber

/**
 * @author nitishbhatt
 */
class MainViewModel(private val interactor: MarvelInteractor,
                    private val schedulerProvider: SchedulerProvider) : ViewModel() {
    private val compositeDisposable by lazy { CompositeDisposable() }
    val herosData = MutableLiveData<List<MarvelSuperHeroes>>()
    val isLoading = ObservableField<Boolean>()

    fun showAllSuperHeros() {
        isLoading.set(true)
        compositeDisposable.add(superHerosList())
    }

    private fun superHerosList(): Disposable {
        return interactor.getAllSuperHeroes()
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribeBy(onSuccess = {
                    onHerosListReceived(it)
                }, onError = {
                    onHerosListReceivedError(it)
                })
    }

    private fun onHerosListReceivedError(it: Throwable) {
        isLoading.set(false)
        herosData.postValue(null)
        Timber.e(it)
    }

    private fun onHerosListReceived(it: List<MarvelSuperHeroes>) {
        isLoading.set(false)
        herosData.postValue(it)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

}
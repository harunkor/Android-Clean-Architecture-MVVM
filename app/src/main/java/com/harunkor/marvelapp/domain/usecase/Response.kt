package com.harunkor.marvelapp.domain.usecase

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

sealed class Response<T> {

    protected var processDisposable: Disposable? = null
    protected val compositeDisposable = CompositeDisposable()
    internal abstract fun processResponse(): Single<T>

    fun execute(
        onSuccess: ((t: T) -> Unit),
        onError: ((t: Throwable) -> Unit),
        onFinished: () -> Unit = {}
    ) {
        disposeProcess()
        processDisposable = processResponse()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doAfterTerminate(onFinished)
            .subscribe(onSuccess, onError)

        processDisposable?.let {
            compositeDisposable.add(it)
        }
    }
    fun disposeProcess() {
        processDisposable?.let {
            if (!it.isDisposed) {
                it.dispose()
            }
        }
    }

}
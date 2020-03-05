package it.sephiroth.android.numberpicker.demo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel(application: Application) : AndroidViewModel(application) {
    val globalProgress: MutableLiveData<Float> = MutableLiveData<Float>().apply { value = 0f }

    val minValue: Float = 0f
    val maxValue: Float = 1f
    val defaultValue: Float = 0.5f
}

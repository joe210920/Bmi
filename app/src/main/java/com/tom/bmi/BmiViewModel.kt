package com.tom.bmi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData


class BmiViewModel : ViewModel() {
    val ed_weight = MutableLiveData<Float>()
    val ed_height = MutableLiveData<Float>()
    val showBmi = MutableLiveData<Float>()







}

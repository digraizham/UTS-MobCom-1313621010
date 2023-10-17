package com.example.uts.utsmobilecomputing.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Matkul(
    @StringRes val matkulNameRes: Int,
    @StringRes val sksRes: Int,
    @DrawableRes val imageRes: Int
)
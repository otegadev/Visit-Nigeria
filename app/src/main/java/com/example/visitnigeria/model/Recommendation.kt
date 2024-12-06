package com.example.visitnigeria.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Recommendation (
    @StringRes val name: Int,
    @DrawableRes val image: Int,
    @StringRes val information: Int,
    @StringRes val location: Int
) {
}
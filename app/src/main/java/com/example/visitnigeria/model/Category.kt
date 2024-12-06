package com.example.visitnigeria.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Category (
    @StringRes val name: Int,
    @DrawableRes val imageId: Int,
    val recommendations: List<Recommendation>
) {
}
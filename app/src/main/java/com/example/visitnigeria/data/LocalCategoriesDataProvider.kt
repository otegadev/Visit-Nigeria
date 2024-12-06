package com.example.visitnigeria.data

import com.example.visitnigeria.R
import com.example.visitnigeria.model.Category

object LocalCategoriesDataProvider {
    val categoriesList: List<Category> = listOf(
        Category(
            name = R.string.category_amusement_park,
            imageId = R.drawable.amusement_park,
            recommendations = LocalRecommendationsDataProvider.amusementParkRecommendations
        ),
        Category(
            name = R.string.category_beaches,
            imageId = R.drawable.beach,
            recommendations = LocalRecommendationsDataProvider.beachesRecommendations
        ),
        Category(
            name = R.string.category_hotels,
            imageId = R.drawable.hotel,
            recommendations = LocalRecommendationsDataProvider.hotelsRecommendations
        ),
        Category(
            name = R.string.category_natural_attractions,
            imageId = R.drawable.nature_explore,
            recommendations = LocalRecommendationsDataProvider.naturalAttractionRecommendation
        ),
        Category(
            name = R.string.category_natural_reserves_zoos,
            imageId = R.drawable.nature,
            recommendations = LocalRecommendationsDataProvider.naturalReserveRecommendation
        ),
        Category(
            name = R.string.category_recreational_centers,
            imageId = R.drawable.game_recreation,
            recommendations = LocalRecommendationsDataProvider.recreationalCentersRecommendation
        ),
        Category(
            name = R.string.category_restaurants,
            imageId = R.drawable.restaurant,
            recommendations = LocalRecommendationsDataProvider.restaurantsRecommendation
        ),
        Category(
            name = R.string.category_shopping_malls,
            imageId = R.drawable.shopping,
            recommendations = LocalRecommendationsDataProvider.shoppingMallRecommendation
        )

    )

}
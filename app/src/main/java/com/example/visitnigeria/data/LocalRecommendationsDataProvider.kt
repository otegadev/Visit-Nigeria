package com.example.visitnigeria.data

import com.example.visitnigeria.R
import com.example.visitnigeria.model.Recommendation

object LocalRecommendationsDataProvider {
    val amusementParkRecommendations: List<Recommendation> = listOf(
        Recommendation(
            name = R.string.recommendation_amusement_park_1,
            image = R.drawable.emmanel_park,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_amusement_park_1_location
        ),
        Recommendation(
            name = R.string.recommendation_amusement_park_2,
            image = R.drawable.hi_impact,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_amusement_park_2_location
        ),
        Recommendation(
            name = R.string.recommendation_amusement_park_3,
            image = R.drawable.img_4044,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_amusement_park_3_location
        ),
        Recommendation(
            name = R.string.recommendation_amusement_park_4,
            image = R.drawable.park_vega,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_amusement_park_4_location
        ),
    )

    val beachesRecommendations: List<Recommendation> = listOf(
        Recommendation(
            name = R.string.recommendation_beaches_1,
            image = R.drawable.landmark,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_beaches_1_location
        ),
        Recommendation(
            name = R.string.recommendation_beaches_2,
            image = R.drawable.ibeno,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_beaches_2_location
        ),
        Recommendation(
            name = R.string.recommendation_beaches_3,
            image = R.drawable.suntan,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_beaches_3_location
        ),
        Recommendation(
            name = R.string.recommendation_beaches_4,
            image = R.drawable.oniru,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_beaches_4_location
        )
    )

    val hotelsRecommendations: List<Recommendation> = listOf(
        Recommendation(
            name = R.string.recommendation_hotels_1,
            image = R.drawable.transcorp,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_hotels_1_location
        ),
        Recommendation(
            name = R.string.recommendation_hotels_2,
            image = R.drawable.lagos_continental,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_hotels_2_location
        ),
        Recommendation(
            name = R.string.recommendation_hotels_3,
            image = R.drawable.eko,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_hotels_3_location
        ),
        Recommendation(
            name = R.string.recommendation_hotels_4,
            image = R.drawable.radisson,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_hotels_4_location
        ),
        Recommendation(
            name = R.string.recommendation_hotels_5,
            image = R.drawable.exterior,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_hotels_5_location
        )
    )

    val naturalAttractionRecommendation: List<Recommendation> = listOf(
        Recommendation(
            name = R.string.recommendation_natural_attractions_1,
            image = R.drawable.zuma,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_natural_attractions_1_location
        ),
        Recommendation(
            name = R.string.recommendation_natural_attractions_2,
            image = R.drawable.wikki,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_natural_attractions_2_location
        ),
        Recommendation(
            name = R.string.recommendation_natural_attractions_3,
            image = R.drawable.ikogosi,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_natural_attractions_3_location
        ),
        Recommendation(
            name = R.string.recommendation_natural_attractions_4,
            image = R.drawable.idanre,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_natural_attractions_4_location
        )
    )

    val naturalReserveRecommendation: List<Recommendation> = listOf(
        Recommendation(
            name = R.string.recommendation_natural_reserves_zoos_1,
            image = R.drawable.lekkicon,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_natural_reserves_zoos_1_location
        ),
        Recommendation(
            name = R.string.recommendation_natural_reserves_zoos_2,
            image = R.drawable.yankari,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_natural_reserves_zoos_2_location
        ),
        Recommendation(
            name = R.string.recommendation_natural_reserves_zoos_3,
            image = R.drawable.ogba,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_natural_reserves_zoos_3_location
        ),
        Recommendation(
            name = R.string.recommendation_natural_reserves_zoos_4,
            image = R.drawable.uizoo,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_natural_reserves_zoos_4_location
        )
    )

    val recreationalCentersRecommendation: List<Recommendation> = listOf(
        Recommendation(
            name = R.string.recommendation_recreational_centers_1,
            image = R.drawable.vrplace,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_recreational_centers_1_location
        ),
        Recommendation(
            name = R.string.recommendation_recreational_centers_2,
            image = R.drawable.leisure_sports_paintball,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_recreational_centers_2_location
        ),
        Recommendation(
            name = R.string.recommendation_recreational_centers_3,
            image = R.drawable.upbeat,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_recreational_centers_3_location
        ),
        Recommendation(
            name = R.string.recommendation_recreational_centers_4,
            image = R.drawable.crusifix,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_recreational_centers_4_location
        )
    )

    val restaurantsRecommendation: List<Recommendation> = listOf(
        Recommendation(
            name = R.string.recommendation_restaurants_1,
            image = R.drawable.wakame_interior,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_restaurants_1_location
        ),
        Recommendation(
            name = R.string.recommendation_restaurants_2,
            image = R.drawable.hard_rock_cafe_lagos,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_restaurants_2_location
        ),
        Recommendation(
            name = R.string.recommendation_restaurants_3,
            image = R.drawable.blucabana_restaurant,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_restaurants_3_location
        ),
        Recommendation(
            name = R.string.recommendation_restaurants_4,
            image = R.drawable.asiatown,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_restaurants_5_location
        ),
        Recommendation(
            name = R.string.recommendation_restaurants_5,
            image = R.drawable.ekaabo,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_restaurants_5_location
        )
    )

    val shoppingMallRecommendation: List<Recommendation> = listOf(
        Recommendation(
            name = R.string.recommendation_shopping_malls_1,
            image = R.drawable.ikejamall_entrance,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_shopping_malls_1_location
        ),
        Recommendation(
            name = R.string.recommendation_shopping_malls_2,
            image = R.drawable.jabi_lake_mall_abuja_1,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_shopping_malls_2_location
        ),
        Recommendation(
            name = R.string.recommendation_shopping_malls_3,
            image = R.drawable.dunes_center,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_shopping_malls_3_location
        ),
        Recommendation(
            name = R.string.recommendation_shopping_malls_4,
            image = R.drawable.megaplaza,
            information = R.string.recommendation_lorem_description,
            location = R.string.recommendation_shopping_malls_4_location
        ),
    )
}
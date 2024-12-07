package com.example.visitnigeria.ui.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visitnigeria.R
import com.example.visitnigeria.data.LocalRecommendationsDataProvider
import com.example.visitnigeria.model.Recommendation
import com.example.visitnigeria.ui.theme.VisitNigeriaTheme

@Composable
fun RecommendationScreen(
    recommendationList: List<Recommendation>,
    onClick: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface (modifier = modifier) {
        RecommendationList(
            recommendationList = recommendationList,
            onClick = onClick,
            modifier = Modifier
                .padding(dimensionResource(R.dimen.padding_small))
        )
    }
}

@Composable
fun RecommendationList(
    recommendationList: List<Recommendation>,
    onClick: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn (modifier = modifier) {
        items(recommendationList) {recommendation: Recommendation ->
            RecommendationCard(
                recommendationImage = recommendation.image,
                recommendationName = recommendation.name,
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_small))
                    .clickable { onClick(recommendation) }
                    .clip(MaterialTheme.shapes.small)
                    .background(MaterialTheme.colorScheme.surfaceVariant)
            )
        }
    }
}

@Composable
fun RecommendationCard(
    @DrawableRes recommendationImage: Int,
    @StringRes recommendationName: Int,
    modifier: Modifier = Modifier
) {
    Box (modifier = modifier) {
        Column {
            RecommendationImage(
                recommendationImage = recommendationImage,
                recommendationName = recommendationName,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize()
                    .size(width = 500.dp, height = 250.dp)
            )
            Text(
                text = stringResource(recommendationName),
                style = MaterialTheme.typography.headlineMedium,
                maxLines = 1,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_small))
            )
        }
    }
}

@Composable
fun RecommendationImage(
    @DrawableRes recommendationImage: Int,
    @StringRes recommendationName: Int,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(recommendationImage),
            contentDescription = stringResource(recommendationName),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}
@Preview
@Composable
fun RecommendationCardDarkPreview() {
    VisitNigeriaTheme (darkTheme = true) {
        RecommendationCard(
            recommendationImage = R.drawable.exterior,
            recommendationName = R.string.recommendation_hotels_5,
            modifier = Modifier
                .clip(MaterialTheme.shapes.small)
                .background(MaterialTheme.colorScheme.surfaceVariant),
        )
    }
}

@Preview
@Composable
fun RecommendationCardLightPreview() {
    VisitNigeriaTheme (darkTheme = false) {
        RecommendationCard(
            recommendationImage = R.drawable.exterior,
            recommendationName = R.string.recommendation_hotels_5,
            modifier = Modifier
                .clip(MaterialTheme.shapes.small)
                .background(MaterialTheme.colorScheme.surfaceVariant),
        )
    }
}

@Preview
@Composable
fun RecommendationListDarkPreview() {
    VisitNigeriaTheme(darkTheme = true) {
        RecommendationList(
            recommendationList = LocalRecommendationsDataProvider.restaurantsRecommendation,
            onClick = {}
        )
    }
}

@Preview
@Composable
fun RecommendationScreenDarkPreview() {
    VisitNigeriaTheme(darkTheme = true) {
        RecommendationScreen(
            recommendationList = LocalRecommendationsDataProvider.naturalAttractionRecommendation,
            onClick = {},
        )
    }
}

@Preview
@Composable
fun RecommendationScreenLightPreview() {
    VisitNigeriaTheme(darkTheme = false) {
        RecommendationScreen(
            recommendationList = LocalRecommendationsDataProvider.naturalAttractionRecommendation,
            onClick = {},
        )
    }
}



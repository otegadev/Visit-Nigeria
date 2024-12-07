package com.example.visitnigeria.ui.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visitnigeria.R
import com.example.visitnigeria.ui.theme.VisitNigeriaTheme

@Composable
fun InformationScreen(
    @DrawableRes recommendationImage: Int,
    @StringRes recommendationName: Int,
    @StringRes recommendationLocation: Int,
    @StringRes recommendationDetails: Int,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()
    Surface(modifier = modifier) {
        Column (modifier = Modifier
            .padding(dimensionResource(R.dimen.padding_small))
            .verticalScroll(scrollState)
        ) {
            RecommendationImage(
                recommendationImage = recommendationImage,
                recommendationName = recommendationName,
                modifier = Modifier
                    .clip(MaterialTheme.shapes.small)
                    .fillMaxWidth()
                    .size(width = 500.dp, height = 250.dp)
            )
            IconAndText(
                text = R.string.location,
                detailText = recommendationLocation,
                icon = Icons.Rounded.LocationOn,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium))
            )
            IconAndText(
                text = R.string.about,
                detailText = recommendationDetails,
                icon = Icons.Rounded.Info,
                modifier = Modifier.padding(
                    top = dimensionResource(R.dimen.padding_medium),
                    start = dimensionResource(R.dimen.padding_medium),
                    end = dimensionResource(R.dimen.padding_medium),
                )

            )
        }
    }
}

@Composable
private fun IconAndText(
    @StringRes text: Int,
    @StringRes detailText: Int,
    icon: ImageVector,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null
            )
            Spacer(Modifier.width(dimensionResource(R.dimen.padding_extra_small)))
            Text(
                text = stringResource(text),
                style = MaterialTheme.typography.headlineSmall
            )
        }
        Text(
            text = stringResource(detailText),
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .padding(
                    start = dimensionResource(R.dimen.padding_small),
                    top = dimensionResource(R.dimen.padding_small)
                ),

        )
    }
}

@Preview
@Composable
fun IconAndTextPreview() {
    VisitNigeriaTheme (darkTheme = true) {
        IconAndText(
            text = R.string.location,
            icon = Icons.Rounded.LocationOn,
            detailText = R.string.recommendation_beaches_1_location
        )
    }
}

@Preview
@Composable
fun InformationScreenDarkPreview() {
    VisitNigeriaTheme (darkTheme = true) {
        InformationScreen(
            recommendationImage = R.drawable.exterior,
            recommendationName = R.string.recommendation_hotels_5,
            recommendationLocation = R.string.recommendation_hotels_5_location,
            recommendationDetails = R.string.recommendation_lorem_description
        )
    }
}

@Preview
@Composable
fun InformationScreenLightPreview() {
    VisitNigeriaTheme (darkTheme = false) {
        InformationScreen(
            recommendationImage = R.drawable.exterior,
            recommendationName = R.string.recommendation_hotels_5,
            recommendationLocation = R.string.recommendation_hotels_5_location,
            recommendationDetails = R.string.recommendation_lorem_description
        )
    }
}
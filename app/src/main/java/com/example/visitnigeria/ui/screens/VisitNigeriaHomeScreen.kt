package com.example.visitnigeria.ui.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visitnigeria.R
import com.example.visitnigeria.data.LocalCategoriesDataProvider
import com.example.visitnigeria.model.Category
import com.example.visitnigeria.ui.theme.VisitNigeriaTheme

@Composable
fun CategoryScreen(
    categoryItems: List<Category>,
    onClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface (modifier = modifier) {
        CategoryList(
            categoryItems = categoryItems,
            onClick =  onClick
        )
    }
}

@Composable
fun CategoryList(
    categoryItems: List<Category>,
    onClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn (modifier = modifier) {
        items(categoryItems) { item: Category ->
            CategoryCard(
                categoryImage = item.imageId,
                categoryName = item.name,
                onClick = { onClick(item) },
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_small))
                    .fillMaxWidth(),
                category = item
            )
        }
    }
}

@Composable
fun CategoryCard (
    @DrawableRes categoryImage: Int,
    @StringRes categoryName: Int,
    category: Category,
    onClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = {onClick(category)},
        modifier = modifier
    ) {
        Row {
            CategoryVectorImage(
                vectorImage = categoryImage,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
            )
            Text(
                text = stringResource(categoryName),
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.fillMaxWidth()
                    .align(Alignment.CenterVertically)
                    .padding(dimensionResource(R.dimen.padding_small))
            )
        }
    }
}

@Composable
fun CategoryVectorImage(
    @DrawableRes vectorImage: Int,
    modifier: Modifier = Modifier
) {
    Card (
        modifier = modifier
    ) {
        Image(
            painter = painterResource(vectorImage),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .size(width = 70.dp, height = 70.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}

@Preview (showBackground = false)
@Composable
fun CategoryVectorImageDarkPreview () {
    VisitNigeriaTheme (darkTheme = true) {
        CategoryVectorImage(
            vectorImage = R.drawable.nature
        )
    }
}

@Preview(showBackground = false)
@Composable
fun CategoryVectorImageLightPreview () {
    VisitNigeriaTheme (darkTheme = false) {
        CategoryVectorImage(
            vectorImage = R.drawable.nature
        )
    }
}

@Preview
@Composable
fun CategoryCardDarkPreview() {
    VisitNigeriaTheme (darkTheme = true) {
        CategoryCard(
            categoryImage = R.drawable.amusement_park,
            categoryName = R.string.category_amusement_park,
            onClick = {},
            category = LocalCategoriesDataProvider.categoriesList[0]
        )
    }
}

@Preview
@Composable
fun CategoryCardLightPreview() {
    VisitNigeriaTheme (darkTheme = false) {
        CategoryCard(
            categoryImage = R.drawable.game_recreation,
            categoryName = R.string.category_recreational_centers,
            onClick = {},
            category = LocalCategoriesDataProvider.categoriesList[0]
        )
    }
}

@Preview
@Composable
fun CategoryListDarkPreview() {
    VisitNigeriaTheme (darkTheme = true) {
        CategoryList(
            categoryItems = LocalCategoriesDataProvider.categoriesList,
            onClick = {}
        )
    }
}

@Preview (showSystemUi = true)
@Composable
fun CategoryListLightPreview() {
    VisitNigeriaTheme {
        CategoryList(
            categoryItems = LocalCategoriesDataProvider.categoriesList,
            onClick = {}
        )
    }
}

@Preview (showSystemUi = true)
@Composable
fun CategoryScreenDarkPreview() {
    VisitNigeriaTheme (darkTheme = true) {
        CategoryScreen(
            categoryItems = LocalCategoriesDataProvider.categoriesList,
            onClick = {},
        )
    }
}

@Preview (showSystemUi = true)
@Composable
fun CategoryScreenLightPreview() {
    VisitNigeriaTheme (darkTheme = false) {
        CategoryScreen(
            categoryItems = LocalCategoriesDataProvider.categoriesList,
            onClick = {},
        )
    }
}
package com.example.visitnigeria.ui

import androidx.lifecycle.ViewModel
import com.example.visitnigeria.data.LocalCategoriesDataProvider
import com.example.visitnigeria.model.Category
import com.example.visitnigeria.model.Recommendation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class VisitNigeriaViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(VisitNigeriaUiState())
    val uiState: StateFlow<VisitNigeriaUiState> = _uiState.asStateFlow()

    fun updateCurrentCategory (selectedCategory: Category) {
        _uiState.update { currentState ->
            currentState.copy(
                currentCategory = selectedCategory,
                currentCategoryRecommendations = selectedCategory.recommendations
            )
        }
    }

    fun updateCurrentRecommendation (selectedRecommendation: Recommendation) {
        _uiState.update { currentState ->
            currentState.copy(
                selectedRecommendation = selectedRecommendation
            )
        }
    }

}

data class VisitNigeriaUiState (
    val categoryList: List<Category> = LocalCategoriesDataProvider.categoriesList,
    val currentCategory: Category = categoryList[0],
    val currentCategoryRecommendations: List<Recommendation> = currentCategory.recommendations,
    val selectedRecommendation: Recommendation = currentCategory.recommendations[0],
)
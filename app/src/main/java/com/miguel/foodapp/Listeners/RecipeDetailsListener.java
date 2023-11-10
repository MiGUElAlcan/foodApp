package com.miguel.foodapp.Listeners;

import com.miguel.foodapp.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}

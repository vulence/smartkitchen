import { mapRecipeList, Recipe } from '@/types/Recipe';
import axios from 'axios';

const BASE_URL = "http://192.168.0.10:8080/api";

export async function fetchRecipes(): Promise<Recipe[]> {
    const response = await axios.get(`${BASE_URL}/recipes`);
    return mapRecipeList(response.data);
}
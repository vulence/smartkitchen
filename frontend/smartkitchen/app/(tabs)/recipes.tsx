import ErrorSnackbar from '@/components/common/ErrorSnackbar';
import ImageCard from '@/components/ImageCard';
import { fetchRecipes } from '@/services/api';
import { Recipe } from '@/types/Recipe';
import { useEffect, useState } from 'react';
import { StyleSheet, View } from 'react-native';
import { ActivityIndicator, useTheme } from 'react-native-paper';

export default function Recipes() {
  const theme = useTheme();

  const [recipes, setRecipes] = useState<Recipe[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    fetchRecipes()
      .then((data) => {
        setRecipes(data);
      })
      .catch((error) => {
        console.error(`Failed to fetch recipes: ${error}`);
        setError("Error while loading recipes!");
      })
      .finally(() => {
        setLoading(false);
      });
  }, []);

  if (loading) {
    return (
      <View>
        <ActivityIndicator size="large" />
      </View>
    )
  }

  return (
    <>
      <View style={styles.container}>
        {recipes.map((recipe) => (
          <ImageCard
            key={recipe.id}
            title={recipe.name}
            imageUrl="https://cleananddelicious.com/wp-content/uploads/2025/01/avocado-toast.jpg"
            timeToMake={recipe.minutesToMake}
            totalKcal={recipe.totalKcal}
          />
        ))}
      </View>

      <ErrorSnackbar visible={!!error} onDismiss={() => setError("")} message={error ?? ''} />
    </>
  );  
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#25292e',
  },
});

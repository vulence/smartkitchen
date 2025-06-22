import ImageCard from '@/components/ImageCard';
import { StyleSheet, View } from 'react-native';
import { useTheme } from 'react-native-paper';

export default function Recipes() {
  const theme = useTheme();
  
  return (
    <View style={styles.container}>
      <ImageCard
        title="Toast with eggs and avocado"
        imageUrl="https://cleananddelicious.com/wp-content/uploads/2025/01/avocado-toast.jpg"
        timeToMake={15}
        totalKcal={100}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#25292e',
  },
});

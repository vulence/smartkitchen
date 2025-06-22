import { Stack } from "expo-router";
import { MD3DarkTheme, PaperProvider } from "react-native-paper";

const theme = {
  ...MD3DarkTheme, // or MD3DarkTheme
  roundness: 2,
  colors: {
    ...MD3DarkTheme.colors,
    primary: '#3498db',
    secondary: '#f1c40f',
    tertiary: '#a1b2c3',
  },
};

export default function RootLayout() {
  return (
    <PaperProvider theme={theme}>
      <Stack>
        <Stack.Screen name="(tabs)" options={{ headerShown: false }} />
      </Stack>
    </PaperProvider>
  );
}
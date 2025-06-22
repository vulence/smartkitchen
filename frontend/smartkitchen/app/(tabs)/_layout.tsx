import Ionicons from '@expo/vector-icons/Ionicons';
import { Tabs } from "expo-router";

export default function TabLayout() {
    return (
        <Tabs
            screenOptions={{
                tabBarActiveTintColor: '#3498db',
                headerStyle: {
                    backgroundColor: '#25292e',
                },
                headerShadowVisible: false,
                headerTintColor: '#fff',
                tabBarStyle: {
                    backgroundColor: '#25292e',
                },
            }}
        >
            <Tabs.Screen 
                name="recipes" 
                options ={{
                    title: "Recipes",
                    tabBarIcon: ({ color, focused }) => (
                        <Ionicons name={focused ? 'home-sharp' : 'home-outline'} color={color} size={24} />
                    ),
                }} 
            />
            <Tabs.Screen
                name="favorites"
                options={{ 
                    title: "Favorites",
                    tabBarIcon: ({ color, focused }) => (
                        <Ionicons name={focused ? 'heart-sharp' : 'heart-outline'} color={color} size={24} />
                    ),
                }} 
            />
        </Tabs>
    );
}
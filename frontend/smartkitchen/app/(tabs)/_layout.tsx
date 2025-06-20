import { Tabs } from "expo-router";

export default function TabLayout() {
    return (
        <Tabs>
            <Tabs.Screen name = "recipes" options ={{ title: "Recipes" }} />
            <Tabs.Screen name = "favorites" options={{ title: "Favorites" }} />
        </Tabs>
    );
}
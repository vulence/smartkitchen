import { ImageBackground, StyleSheet, View } from "react-native";
import { Card, Icon, IconButton, Text } from "react-native-paper";

interface Props {
    imageUrl: string;
    title: string;
    timeToMake: number;
    totalKcal: number;
}

export default function ImageCard(props: Props) {
    return (
        <Card style={styles.container} onPress={() => { }}>
            <ImageBackground
                source={{ uri: props.imageUrl }}
                imageStyle={styles.image}
                style={styles.imageContainer}
            >
                <View style={styles.overlay}>
                    <View style={styles.titleContainer}>
                        <Text style={styles.title}>{props.title}</Text>
                    </View>

                    <View style={styles.kcalContainer}>
                        <Icon 
                            source="fire"
                            size={22} 
                            color='#ffce00' 
                        />
                        <Text>{props.totalKcal} kcal</Text>
                    </View>

                    <View style={styles.favoritesContainer}>
                        <IconButton 
                            style={styles.favoriteIcon} 
                            icon="heart-outline" 
                            size={30}
                            iconColor='pink'
                            onPress={() => {}}
                        />
                    </View>

                    <View style={styles.timeToMakeContainer}>
                        <Icon 
                            source="clock-outline" 
                            size={22} 
                        />
                        <Text>{props.timeToMake} mins</Text>
                    </View>
                </View>
            </ImageBackground>
        </Card>
    );
}

const styles = StyleSheet.create({
    imageContainer: {
        height: 180,
    },
    image: {
        borderRadius: 12,
        opacity: 0.55
    },
    container: {
        margin: 15,
        height: 180
    },
    overlay: {
        position: 'absolute',
        height: '100%',
        width: '100%',
    },
    titleContainer: {
        position: 'absolute',
        bottom: 35,
        marginLeft: 10,
    },
    title: {
        fontWeight: "bold",
        fontSize: 25,
    },
    timeToMakeContainer: {
        position: 'absolute',
        left: 10,
        bottom: 7,
        flexDirection: "row",
        gap: 4,
    },
    kcalContainer: {
        position: 'absolute',
        right: 0,
        top: 0,
        margin: 8,
        flexDirection: "row",
    },
    favoritesContainer: {
        position: 'absolute',
        left: 0,
        top: 0
    },
    favoriteIcon: {
        margin: 0
    }
})
import AntDesign from '@expo/vector-icons/AntDesign';
import { ImageBackground, StyleSheet } from "react-native";
import { Card, Text } from "react-native-paper";

interface Props {
    imageUrl: string;
    title: string;
    timeToMake: number;
    totalKcal: number;
}

export default function ImageCard(props: Props) {
    return (
        <Card style={styles.container} onPress={() => {}}>
            <ImageBackground
                source={{ uri: props.imageUrl }}
                imageStyle={styles.image}
            >
                <Card.Title
                    style={styles.titleContainer}
                    titleStyle={[styles.title, { fontSize: props.title.length > 27 ? 16 : 25}]}
                    title={props.title}
                    titleVariant="headlineMedium"
                />

                <Card.Content style={styles.timeToMakeContainer}>
                    <AntDesign style={styles.clockIcon} name="clockcircleo" size={22} color="white" />
                    <Text>{props.timeToMake} mins</Text>
                </Card.Content>
            </ImageBackground>
        </Card>
    );
}

const styles = StyleSheet.create({
    image: {
        borderRadius: 12,
        height: 180,
        opacity: 0.55
    },
    container: {
        margin: 15,
        height: 180
    },
    titleContainer: {
        bottom: -100
    },
    title: {
        fontWeight: "bold",
        fontSize: 25,
    },
    timeToMakeContainer: {
        bottom: -95,
        flexDirection: "row",
        gap: 8
    },
    clockIcon: {
        opacity: 0.7
    }
});
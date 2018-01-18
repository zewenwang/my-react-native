import React, {Component} from 'react';
import {FlatList, SectionList, StyleSheet, Text, View, AppRegistry} from 'react-native';

export default class FlatListTest extends Component {
    render() {
        return (
            <View style={FlatListStyles.container}>
                <FlatList
                    data={[
                        {key: 'Devin'},
                        {key: 'Jackson'},
                        {key: 'James'},
                        {key: 'Joel'},
                        {key: 'John'},
                        {key: 'Jillian'},
                        {key: 'Jimmy'},
                        {key: 'Julie'},
                    ]}
                    renderItem={({item}) => <Text style={FlatListStyles.item}>{item.key}</Text>}
                />
            </View>
        );
    }
}

const FlatListStyles = StyleSheet.create({
    container: {
        flex: 1,
        // backgroundColor: "red",
        paddingTop: 22
    },
    item: {
        fontSize: 18,
        height: 44,
        // margin: 10,
        padding: 10,
        // backgroundColor: "blue"
    },
});


class SectionListTest extends Component {
    render() {
        return (
            <View style={SectionListStyles.container}>
                <SectionList
                    sections={[
                        {title: 'D', data: ['Devin','James', 'Jillian', 'Jimmy', 'Joel',]},
                        {title: 'J', data: ['Jackson', 'James', 'Jillian', 'Jimmy', 'Joel', 'John', 'Julie']},
                        {title: 'D', data: ['Devin','James', 'Jillian', 'Jimmy', 'Joel',]},
                        {title: 'J', data: ['Jackson', 'James', 'Jillian', 'Jimmy', 'Joel', 'John', 'Julie']},
                        {title: 'D', data: ['Devin','James', 'Jillian', 'Jimmy', 'Joel',]},
                        {title: 'J', data: ['Jackson', 'James', 'Jillian', 'Jimmy', 'Joel', 'John', 'Julie']},
                        {title: 'D', data: ['Devin','James', 'Jillian', 'Jimmy', 'Joel',]},
                        {title: 'J', data: ['Jackson', 'James', 'Jillian', 'Jimmy', 'Joel', 'John', 'Julie']},
                    ]}
                    renderItem={({item}) =>
                        <Text style={SectionListStyles.item}>{item}</Text>
                    }
                    renderSectionHeader={({section}) =>
                        <Text style={SectionListStyles.sectionHeader}>{section.title}</Text>
                    }
                />
            </View>
        );
    }
}

const SectionListStyles = StyleSheet.create({
    container: {
        flex: 1,
        paddingTop: 22
    },
    sectionHeader: {
        paddingTop: 2,
        paddingLeft: 10,
        paddingRight: 10,
        paddingBottom: 2,
        fontSize: 14,
        fontWeight: 'bold',
        backgroundColor: 'rgba(247,247,247,1.0)',
    },
    item: {
        padding: 10,
        fontSize: 18,
        height: 44,
        backgroundColor:"gray"
    },
});

// AppRegistry.registerComponent('AwesomeProject', () => FlatListTest);
AppRegistry.registerComponent('ListTest', () => SectionListTest);

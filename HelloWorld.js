import React, {Component} from 'react';
import {Text, View, AppRegistry, StyleSheet} from 'react-native';

class HelloWorld extends Component {
    render() {
        return (
            //<View style={styles.container}>
            //<Text style={styles.hello}>Hello World</Text>
            // </View>
            <View>
                <Text>Hello</Text>
            </View>
        );
    }
}


const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        backgroundColor: 'red',
    },
    hello: {
        fontSize: 20,
        textAlign: 'right',
        margin: 10,
        backgroundColor: 'blue',
    }
});

AppRegistry.registerComponent('HelloWorld', () => HelloWorld);

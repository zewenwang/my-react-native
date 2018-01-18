import React, {Component} from 'react';
import {Text, View, AppRegistry, StyleSheet} from 'react-native';

class HelloWorld extends Component {
    render() {
        return (
            //<View style={styles.container}>
            //<Text style={styles.hello}>Hello World</Text>
            // </View>
            <View>
                <Text>Hello World</Text>
            </View>
        );
    }
}


const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        background: 'red',
    },
    hello: {
        fontSize: 20,
        textAlign: 'end',
        margin: 10,
        background: 'blue',
    }
});

AppRegistry.registerComponent('HelloWorld', () => HelloWorld);

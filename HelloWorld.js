import React, {Component} from 'react';
import {Text, View, AppRegistry} from 'react-native';

class HelloWorld extends Component {
    render() {
        return (
            <View>
                <Text>Hello World</Text>
            </View>
        );
    }
}

AppRegistry.registerComponent('HelloWorld', () => HelloWorld);

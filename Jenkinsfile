
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
               sh './gradlew clean build'
            }
        }
        stage('API Tests') {
            steps {
                   sh './gradlew clean allScenarios'
            }
        }
    }
}

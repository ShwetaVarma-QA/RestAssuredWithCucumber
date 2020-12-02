pipeline {
    stages {
        stage('build') {
            steps {
               sh './gradlew clean build'
            }
        }
    }
}
stages {
        stage('API Tests') {
            steps {
                container('node') {
                   sh './gradlew clean allScenarios'
                }
            }
        }
    }


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

    stage('Email Notifications'){
         steps  {
                emailext body: '''Hi,

                        This is a test notification for your Jenkins Pipeline''',
                subject: 'Jenkins Pipeline Notification',
                to: 'shwetavarma28@gmail.com'
                 }
        }
    }
}

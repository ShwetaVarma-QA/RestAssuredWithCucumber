
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
                   sh './gradlew cucumber -P tags=@AllEmployees'
            }
        sendEmailNotification()
        }
    }
}

private void sendEmailNotification(){
mail
to: 'shwetavarma28@gmail.com',
          subject: 'Jenkins Pipeline Notification',
           body: '''Hi,This is a test notification for your Jenkins Pipeline'''
}

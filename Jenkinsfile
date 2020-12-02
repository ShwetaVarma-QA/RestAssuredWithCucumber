
pipeline {
triggers {
        cron('0 */3 * * 0-6')
    }
    
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
            echo "finishing tests"
        sendEmailNotification()
        }
        }
    }
}

private void sendEmailNotification(){
emailext to: 'shwetavarma28@gmail.com',
     subject: "Jenkins Pipeline Notification",
     body: "Hi,This is a test notification for your Jenkins Pipeline"
}

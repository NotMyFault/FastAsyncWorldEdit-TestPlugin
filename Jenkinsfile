pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build'
                archiveArtifacts artifacts: '**/build/*.jar', fingerprint: true 
            }
        }
    }
}

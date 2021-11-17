pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                gradlew clean build
                archiveArtifacts artifacts: '**/build/*.jar', fingerprint: true 
            }
        }
    }
}

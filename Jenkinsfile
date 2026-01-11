pipeline {
    agent any

    tools {
        maven 'maven'
        jdk 'jdk21'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                dir('miniProjetDevOps') {
                    bat 'mvn clean package'
                }
            }
        }
    }
    
    post {
        success {
            echo 'Le projet a été compilé avec succès !'
        }
        failure {
            echo 'Le build a échoué.'
        }
    }
}
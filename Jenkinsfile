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
                    sh 'mvn clean package'
                }
            }
        }
        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'miniProjetDevOps/target/*.jar', allowEmptyArchive: false
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Application déployée avec succès sur le serveur de production (simulé)"'
            }
        }
    }
    
    post {
        always {
            echo 'Pipeline terminé.'
        }
        success {
            echo 'Le projet a été compilé avec succès !'
        }
        failure {
            echo 'Le build ou les tests ont échoué.'
        }
    }
}
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Downloading project from GitHub'
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat '"C:/Apache/Maven/apache-maven-3.10.0/bin/mvn.cmd" clean test'
            }
        }

        stage('Generate JaCoCo Report') {
            steps {
                bat '"C:/Apache/Maven/apache-maven-3.10.0/bin/mvn.cmd" jacoco:report'
            }
        }

        stage('Publish Test Results') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('Build Complete') {
            steps {
                echo 'Build completed successfully!'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESS!'
        }

        failure {
            echo 'BUILD FAILED!'
        }

        always {
            echo 'Pipeline execution finished.'
        }
    }
}
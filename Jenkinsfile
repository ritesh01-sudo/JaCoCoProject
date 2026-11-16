```groovy
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
                echo 'Compiling Java code and running JUnit tests'

                bat '"C:/Apache/Maven/apache-maven-3.10.0/bin/mvn.cmd" clean test'
            }
        }

        stage('Generate JaCoCo Report') {
            steps {
                echo 'Generating JaCoCo code coverage report'

                bat '"C:/Apache/Maven/apache-maven-3.10.0/bin/mvn.cmd" jacoco:report'
            }
        }

        stage('Publish Test Results') {
            steps {
                echo 'Publishing JUnit test results'

                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('Build Complete') {
            steps {
                echo 'Java project build completed successfully!'
            }
        }
    }

    post {
        success {
            echo 'SUCCESS: All stages completed successfully!'
        }

        failure {
            echo 'FAILURE: Please check the Jenkins Console Output.'
        }

        always {
            echo 'Jenkins pipeline execution finished.'
        }
        stage('Build and Test') {
            steps {
                bat '"C:/Apache/Maven/apache-maven-3.10.0/bin/mvn.cmd" clean test'
            }
        }
    }
}

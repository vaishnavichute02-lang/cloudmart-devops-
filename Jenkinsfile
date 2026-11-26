
pipeline {
    agent any

    environment {
        DOCKER_HOST = 'tcp://docker:2375'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t cloudmart-app:latest .'
            }
        }

        stage('Verify Docker Image') {
            steps {
                sh 'docker images cloudmart-app'
            }
        }
    }
}

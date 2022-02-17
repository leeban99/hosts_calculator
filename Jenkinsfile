pipeline {
    agent any
    stages{
        stage('Build'){
            steps{
                  script {
                    sh 'echo inside the Build stage'
                    sh 'mvn package'

                }
            }
        }
        stage('Test'){
            steps {
                script {
                    sh 'echo inside the Test stage'
                }
            }
        }
        stage('Build Docker image'){
            steps {
                script {
                    sh 'docker build -t calculate_host'
                }
            }
        }
        stage('Run the service'){
            steps {
                script {
                    sh 'docker run calculate_host'
                }
            }

        }
        stage('Deploy'){
            steps {
                script {
                    sh 'echo inside the deploy stage'
                }
            }
        }

    }
}
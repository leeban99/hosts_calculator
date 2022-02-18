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
                    sh 'docker build -t leeban99/calculate_host .'
                }
            }
        }
        stage('Push image to Dockerhub'){
            steps {
                script {
                    sh 'docker push'
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
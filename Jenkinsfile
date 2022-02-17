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
        stage('Deploy'){
            steps {
                script {
                    sh 'echo inside the deploy stage'
                }
            }
        }

    }
}
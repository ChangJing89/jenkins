pipeline {
    agent {
    docker 'maven:3.3.3'
    }  // jenkins为流水线分配一个执行器和工作区

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'mvn --version'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
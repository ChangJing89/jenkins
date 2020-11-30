pipeline {
    agent {
    docker
    {
    image 'maven:3.3.3'
    args '-v /root/.m2:/root/.m2'
    }
    }  // jenkins为流水线分配一个执行器和工作区

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'mvn -B -DskipTests clean package'
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
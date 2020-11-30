pipeline {
  agent {
    docker {
      image 'maven:3.3.3'
      args '-v c:/repository:/root/.m2'
    }

  }
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
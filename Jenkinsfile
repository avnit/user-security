pipeline {
  agent {
    node {
      label 'test'
    }

  }
  stages {
    stage('git checkour') {
      steps {
        git(url: 'https://github.com/avnit/user-security', branch: 'master')
        sh '''cd springboot/microservice
docker build -t test . 

'''
      }
    }

  }
}
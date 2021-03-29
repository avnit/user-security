pipeline {
  agent any
  }
  stages {
    stage('git checkout') {
      steps {
        git(url: 'https://github.com/avnit/user-security', branch: 'master')
        sh '''cd springboot/microservice
docker build -t test . 

'''
      }
    }

  }
}

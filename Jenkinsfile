pipeline {
  agent any

  stages {
    stage ('Build') {
      steps {
      sh 'mvn clean install -f CustomerRepoRestApi/pom.xml'
      }
    }
  }
}

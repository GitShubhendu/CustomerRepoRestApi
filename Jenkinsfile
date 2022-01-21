pipeline {
  agent any
  tools {
  maven 'maven3'
    jdk 'jdk8'
    git 'Default'
  }

  stages {
    stage ('Build') {
      steps {
      sh 'mvn clean install'
      }
    }
  }
}

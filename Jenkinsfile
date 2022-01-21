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
      bat 'mvn clean compile'
      }
    }
  }
}

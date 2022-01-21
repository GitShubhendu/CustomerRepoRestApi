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
    stage ('Test') {
      steps {
      bat 'mvn clean test'
      }
    }
    stage ('install') {
      steps {
      bat 'mvn clean install'
      }
    }
  }
}

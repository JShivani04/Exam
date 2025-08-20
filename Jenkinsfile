Pipeline {
  agent any
  Stages {
    stage('compute') {
      steps{
        bat 'javac Factorial.java TestFactorial.java'
      }
    }
    stage('Test') {
      steps {
        bat 'java TestFactorial'
      }
    }
    stage('Run') {
      steps{
        bat 'java Factorial'
      }
    }
    stage('PACKAGE jar') {
      steps{
        jar cfm Factorial.jar manifest.txt factorial.class
      }
    }
    stage ('Artifact jar') {
      steps{
        archieveartifact artifact:Factorial.jar
      }
    }
  }
  POST {
    if (Successful) {
      echo('Build, Test, Run, Package-Artifact ready')
    }
    else {
      echo('Build failed')
    }
  }
}

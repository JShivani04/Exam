Pipeline {
  agent any
  Stages {
    stage('Compute') {
      steps{
        bat 'javac Factorial.java TestFactorial.java'
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

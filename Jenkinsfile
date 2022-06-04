pipeline {
    agent any
    tools { 
        maven 'Maven 3.8.5' 
    }
    stages {
        stage('build') {
            steps {
              sh 'mvn --version'
              sh 'mvn clean install -DskipTests'
            }
        }
    }
}
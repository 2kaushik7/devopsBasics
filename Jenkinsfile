pipeline {
    agent any
    stages {
        stage('build') {
            steps {
              sh 'mvn clean install -DskipTests'
              sh 'java -jar devopsBasics-v1.jar'
            }
        }
    }
}
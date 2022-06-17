pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    environment {
    	MVN_BUILD = 'clean install'
    
    }
    stages {
        stage('Build') { 
            steps {
            	sh 'echo using env variable : ${MVN_BUILD}'
                sh 'mvn -B -DskipTests ${MVN_BUILD}' 
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test'
            }
        }
  	      
    }
    post {
	    success {
	        mail to: 'kaushik.sst@gmail.com',
	             subject: "success Pipeline",
	             body: "went well"
	    	}
		}
}
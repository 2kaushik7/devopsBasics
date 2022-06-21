pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    environment {
    	MVN_BUILD = 'clean install'
    	PATH = "$PATH:/usr/local/bin"
    
    }
    stages {
    	stage('Initialize') {        

    			def dockerHome = tool 'mydocker'        
    			env.PATH = "${dockerHome}/bin:${env.PATH}"    
    	
    	}
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
        stage('Deploy') {
        	steps{
        		sh 'docker build --platform linux/amd64 -t devops-basics . '
        		sh 'docker run devops-basics'
        	}
  	    }  
    }
  
}
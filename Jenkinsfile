pipeline {
    agent {
        dockerfile true
    }
    environment {
    	MVN_BUILD = 'clean install'
    	PATH = "$PATH:/usr/local/bin"
    
    }
    stages {
    	
     
        stage('Deploy') {
        	steps{
        		sh 'docker build --platform linux/amd64 -t devops-basics . '
        		sh 'docker run devops-basics'
        	}
  	    }  
    }
  
}
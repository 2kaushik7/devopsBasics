pipeline {
    agent any
 
        stage('Deploy') {
        	steps{
        		sh 'docker build --platform linux/amd64 -t devops-basics . '
        		sh 'docker run devops-basics'
        	}
  	    }  
    }
  
}
pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    
    stages {
        stage('Build') { 
            steps {
                sh 'mkdir /root/.m2'
                sh 'chmod 777 /root/.m2'
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
        }
    }
   
}

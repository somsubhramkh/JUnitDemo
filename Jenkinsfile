pipeline {
    
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
    stages {
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
        }
    }

}

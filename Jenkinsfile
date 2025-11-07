pipeline {
    agent {
        // Use a standard Maven-enabled agent for building WAR files
        docker {
            image 'maven:3.8.6-openjdk-17'
            label 'maven-agent'
        }
    }
    
    stages {
        stage('Checkout') {
            steps {
                echo "Checking out code..."
                checkout scm 
            }
        }
        stage('Build & Package') {
            steps {
                echo "Building WAR file with Maven..."
                // Standard Maven command to compile and package, skipping tests for speed
                sh 'mvn clean package -DskipTests' 
            }
        }
        stage('Test & Report') {
            steps {
                echo "Running Unit Tests and publishing results..."
                // Re-run package command with tests
                sh 'mvn test' 
                // Publish the JUnit test report for display in Jenkins UI
                junit '**/target/surefire-reports/*.xml' 
            }
        }
        stage('Deploy (Artifact Ready)') {
            steps {
                echo 'Artifact built: The WAR file is ready to be deployed.'
                // You would add your deployment logic here (e.g., to Tomcat, ECS, or a different server)
                // Example: sh 'scp target/*.war user@tomcat-server:/path/to/webapps/'
            }
        }
    }
}

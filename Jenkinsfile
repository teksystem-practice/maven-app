
pipeline {
    agent { label 'maven-label' }

    tools {
        
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                
                git 'https://github.com/sog2-app/maven-app.git'

                
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

               
            }

            post {
               
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}

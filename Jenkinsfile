pipeline{
	agent any
	
	stages{
		stage('Compile'){
			steps{
				git url: 'https://github.com/BharadwajAyinapurapu/Maven_Project_1.git'
				sh 'mvn clean compile'
			}
		}
		
		stage('Unit Test'){
			steps{
				sh 'mvn test'
			}
			post{
				always{
					junit '**/target/surefire-reports/TEST-*.xml'
				}
			}
		}
		
		stage('Publish'){
			steps{
				sh 'mvn package'
			}
			post{
				success{
					archiveArtifacts 'target/*.jar'
				}
			}
		}
	}
}
			

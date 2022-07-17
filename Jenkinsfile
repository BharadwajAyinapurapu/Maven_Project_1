pipeline{
	agent any
	
	stages{
		stage('Preparation'){
			steps{
				git url: 'https://github.com/BharadwajAyinapurapu/Maven_Project_1.git'
			}
		}
		
		stage('Compile'){
			steps{
				sh 'mvn compile'
			}
		}
		
		stage('Unit Test'){
			steps{
				sh 'mvn test'
			}
		}
		
		stage('Package'){
			steps{
				sh 'mvn clean install'
			}
		}
	}
}
			

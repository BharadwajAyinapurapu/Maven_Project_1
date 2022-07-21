pipeline{
	agent any
	
	environment{
	    ARTIFACTORY_ACCESS_TOKEN = credentials('artifactory-access-token')
	}
	stages{
		stage('Compile & Unit Test'){
			steps{
				git url: 'https://github.com/BharadwajAyinapurapu/Maven_Project_1.git'
				sh 'mvn clean test'
			}
			post{
				always{
					junit '**/target/surefire-reports/TEST-*.xml'
				}
			}
		}
		
		stage('Package'){
			steps{
				sh 'mvn package'
			}
			post{
				success{
					archiveArtifacts 'target/*.jar'
				}
			}
		}
		
		stage('Code Quality Check'){
		    steps{
		        withSonarQubeEnv('sonarqube-7.1'){
		            sh 'mvn sonar:sonar'
		        }
		    }
		}
		
		stage('Publish to JFrog'){
		    steps{
		        //sh 'pwd'
		        //sh 'jf rt ping'
		        sh 'jf rt u --url http://192.168.56.102:8082/artifactory/ --access-token ${ARTIFACTORY_ACCESS_TOKEN} target/mavenProject1-1.0-SNAPSHOT.jar Maven_Pipeline_1/'
		   }
		}
	}
}

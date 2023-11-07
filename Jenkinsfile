pipeline{
    environment{
        docker_image = ""
    }
    agent any
    stages{
        stage('stage 1: git clone'){
            steps{
                git branch: 'master',
                url:'https://github.com/vaibhav-vt/SPE-miniproj.git'
            }
        }
        stage('stage 2: maven install'){
            steps{
                sh 'mvn clean install'
            }
        }
        stage('stage 3: build docker image'){
            steps{
                script{
                    docker_image = docker.build "vaibhavvt/miniproj:latest"
                }
            }
        }
        stage('stage 4: push docker image to dockerhub'){
            steps{
                script{
                    docker.withRegistry('', 'DockerHubCred'){
                        docker_image.push()
                    }
                }
            }
        }
        stage('stage 5: clean docker docker images'){
            steps{
                script{
                    sh 'docker container prune -f'
                    sh 'docker image prune -f'
                }
            }
        }
    }
}
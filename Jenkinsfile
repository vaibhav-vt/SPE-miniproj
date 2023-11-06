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
    }
}
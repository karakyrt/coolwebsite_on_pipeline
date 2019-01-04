pipeline {
    agent any
    triggers {
        cron('* * * * *')
    }    
    stages{
        stage("Git Clone"){
            steps{
                git@github.com:karakyrt/coolwebsite_on_pipeline.git
            }
        }
        stage ("Copy file to web" ){
            steps{
                sh "cp -f index.html /var/www/html/index.html"
            }
        }
        stage("Test"){
            steps{
                sh "echo Test"
            }
        }
    }
}

pipeline {
    agent any
    triggers {
        cron('* * * * *')
    }    
    stage("Git Clone"){
        steps{
            git 'git@github.com:rameca231190/webserver_with_jenkins.git'
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

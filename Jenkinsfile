#!/usr/bin/env groovy

pipeline {
    agent {
        label 'master'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '50'))
        timeout(time: 10, unit: 'MINUTES')
        disableConcurrentBuilds()
        timestamps()
    }
    environment {
        APP_NAME = 'USER'
        SOURCE_JOB = "${JOB_NAME}"
        BUILD_REPO_PATH = "/var/deploy"
    }
    stages {
        stage('Assembly') {
            steps {
                script {
                    withEnv([
                            'MVN_HOME=/usr/maven'
                    ]) {
                        sh """${MVN_HOME}/bin/mvn install"""
                    }
                }
            }
        }
    }
    post {
        failure {
            echo 'pipeline failed'
        }
    }
}
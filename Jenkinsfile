pipeline {
   agent any
   parameters{
   choice(
   name:'groups',
   choices:"homePage\nblogPage",
   description:"Choose test page to build"

   )

   }
   stages {
        stage('Checkout') {
          steps {
            echo 'Automation pipeline started'
            git branch:'master', credentialsId: 'GIT_HUB_CREDENTIALS', url: 'https://github.com/mcool8180/Selenium_test_cases.git'
            echo 'Checkout Done'
        }
      }

       stage('Compile') {
         steps {
           sh 'mvn clean compile'
            echo 'Compilation done'

         }
       }

//          stage('Checkout Test') {
//          steps {
//          git branch:'master', credentialsId: 'GIT_HUB_CREDENTIALS', url: 'https://github.com/mcool8180/Selenium_test_cases.git'
//          echo 'Checkout Test Done'
//          }
//        }


      stage('Test') {
         steps {
            sh "mvn clean test -Dgroups=${params.groups}"
            echo 'Test case passed successfully'

         }
       }

   }

   }
   // node('windows-agent') {
   //     try {
   //
   //         stage("Initialize") {
   //             cleanWs()
   //         }
   //
   //         stage("Checkout") {
   //             checkoutRepository()
   //         }
   //
   //         stage('Build and Test') {
   //             runAutomationTest()
   //         }
   //
   //         stage('Publish Results') {
   //             publishResults()
   //         }
   //
   //     } catch (err) {
   //         echo "$err"
   //         currentBuild.result = 'FAILURE'
   //         throw err
   //     } finally {
   //         if (currentBuild.result == 'FAILURE' || currentBuild.result == 'UNSTABLE') {
   //             currentBuild.result = 'FAILURE'
   //         } else {
   //             currentBuild.result = 'SUCCESS'
   //         }
   //     }
   // }
   //
   // def checkoutRepository() {
   //
   //     repoUrl = "https://sapience-analytics@dev.azure.com/sapience-analytics/Sapience%20Analytics%20-%20Next%20Gen/_git/ngp-ui-automation"
   //     targetDir = "ngp-ui-automation"
   //     branchName = "master"
   //
   //     checkout([$class                           : 'GitSCM',
   //               branches                         : [[name: branchName]],
   //               doGenerateSubmoduleConfigurations: false,
   //               extensions                       : [[$class           : 'RelativeTargetDirectory',
   //                                                    relativeTargetDir: targetDir]],
   //               submoduleCfg                     : [],
   //               userRemoteConfigs                : [[credentialsId: 'azure_devops_credentials', url: repoUrl]]
   //     ])
   //
   // }
   //
   // def runAutomationTest() {
   //     dir('ngp-ui-automation') {
   //         withMaven() {
   //             bat "mvn clean test -DexecutionOn=qaint -Pklov"
   //         }
   //     }
   // }
   //
   // def publishResults() {
   //     dir('ngp-ui-automation') {
   //
   //         publishHTML([allowMissing: true,
   //                      alwaysLinkToLastBuild: true,
   //                      keepAll: true,
   //                      reportDir: '',
   //                      reportFiles: 'target/HtmlReport/ExtentHtml.html',
   //                      reportName: 'Test Summary',
   //                      reportTitles: 'Test Summary'
   //         ])
   //     }
   // }

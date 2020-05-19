pipeline {
   agent any
   stages {
        stage('Checkout') {
          steps {

            git branch:'master', credentialsId: 'GIT_HUB_CREDENTIALS', url: 'https://github.com/mcool8180/Selenium_test_cases.git'


        echo 'Checkout Done'
        }
      }

       stage('Compile') {
         steps {
           sh 'mvn clean package'
            echo 'Compilation done'

         }
       }

         stage('Checkout Test') {
         steps {
         git branch:'master', credentialsId: 'GIT_HUB_CREDENTIALS', url: 'https://github.com/mcool8180/Selenium_test_cases.git'
         echo 'Checkout Test Done'
         }
       }


      stage('Test') {
         steps {
            sh 'mvn clean test -Dgroups='
            echo 'Test case passed successfully'

         }
       }

   }

   }

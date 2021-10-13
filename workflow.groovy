// Deploy Java Application
node{
  stage("Pull"){
      sh """
        git 'https://github.com/AlCode88/jenkins-test-connection.git'
        """
  }
  stage("Build"){
      sh """
        ls
        """
    input 'Do you want to continue?'
  }
  stage("Test"){
      sh """
        echo "Test"
        """
  }
  stage("Deploy"){
      sh """
        echo "Deploy"
        """
  }
}
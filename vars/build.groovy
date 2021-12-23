def call(props){

    node{
      stage("checkout"){
          println "Sample stage from shared library to checkout the code"
        
          checkout scm
      }
      
      stage("build"){
          println "Sample stage from shared library to build the code: ${params.buidVersion}"
          
          def buidVersion = params.buidVersion
        
          //sh '"/root/apache-maven-3.8.1/bin/mvn" clean install'
          
          sh"${tool 'maven-3.8.1'}/bin/mvn -V clean -DbuidVersion=${buidVersion}"
          
      }
    }

}

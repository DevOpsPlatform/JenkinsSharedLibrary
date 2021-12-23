def call(props){

    node{
      stage("checkout"){
          println "Sample stage from shared library to checkout the code"
        
          checkout scm
      }
      
      stage("build"){
          println "Sample stage from shared library to build the code: ${props.buidVersion}"
          
          def buidVersion = props.buidVersion
        
          //sh '"/root/apache-maven-3.8.1/bin/mvn" clean install'
          
          sh"${tool 'maven-3.8.1'}/bin/mvn -V clean -DbuidVersion=${props.buidVersion}"
          
      }
    }

}
